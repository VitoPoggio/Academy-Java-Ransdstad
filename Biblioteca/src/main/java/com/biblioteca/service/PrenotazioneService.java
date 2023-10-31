package com.biblioteca.service;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.model.Libro;
import com.biblioteca.model.Membro;
import com.biblioteca.model.Prenotazione;
import com.biblioteca.repository.LibroRepository;
import com.biblioteca.repository.MembroRepository;
import com.biblioteca.repository.PrenotazioneRepository;

@Service
public class PrenotazioneService {
	
	@Autowired
	PrenotazioneRepository pR;
	
	@Autowired
	LibroRepository lR;
	
	@Autowired
	MembroRepository mR;
	
	public Collection<Prenotazione> getPrenotazioni(){
		return pR.getPrenotazioni();
	}
	
	public Prenotazione savePrenotazione(Prenotazione prenotazione) {
		
        return pR.save(prenotazione);
    }

    public Optional<Prenotazione> findById(Long id) {
        return pR.findById(id);
    }

    public void deletePrenotazione(Prenotazione prenotazione) {
        pR.delete(prenotazione);
    }
    
    public boolean prenotaLibro(Long id_membro, Long id_libro) {
    	Membro membro = mR.findById(id_membro).get();
        if (membro.getPrenotazioni().size() >= 3) {
            return false;
        }
        
        Libro lib = lR.findById(id_libro).get();
        if (lR.diminuisciQta(id_libro)) {
            Prenotazione prenotazione = new Prenotazione();
            prenotazione.setLibro(lib);
            prenotazione.setDataInizio(LocalDate.now());
            prenotazione.setDataFine(LocalDate.now().plusDays(3));
            membro.getPrenotazioni().add(prenotazione);
            savePrenotazione(prenotazione);
            return true;
        }
        return false;
    }
}
