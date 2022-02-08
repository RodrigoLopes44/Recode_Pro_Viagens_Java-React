import React from 'react';
import footerPNG from '../Assets/Logos/logo-recode-pro-site.png';

export default function Footer() {
    return (
        <footer class="main-footer">
        <a id="logo" href="https://www.recodepro.org.br">
          <img
            src= {footerPNG}
            alt="Recode Logo"
            width="150px"
          />
        </a>
  
        <h4 align="center" id="info">
          &copy; Recode Tourism Viagens
  
          <br />
  
          Todos os direitos reservados.
        </h4>
      </footer>
    )
}