package com.pvagner.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.pvagner.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
