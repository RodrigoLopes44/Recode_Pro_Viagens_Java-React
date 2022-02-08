export default function Contato() {
    return(
        <form>
      <div class="body-header">
        <h2>
          Olá, viajante. Deseja nos contactar?

          <br /><br />

          Preencha os dados abaixo que em breve responderemos!
        </h2>
      </div>
      <br />
      <fieldset class="form-area">
        <div class="name-area">
          <label for="nome"> <strong> Nome: </strong></label>
          <input type="text" name="nome" id="nome" required />
        </div>

        <br />

        <div class="tel-area">
          <label for="telefone"><strong> Telefone:</strong></label>
          <input type="tel" name="telefone" id="telefone" required />
        </div>

        <br />

        <div class="email-area">
          <label for="email"><strong>E-mail:</strong></label>
          <input type="email" name="email" id="email" required />
        </div>

        <br />

        <div class="contact-choices">
          <label><strong>Deseja ser contactado por qual meio?</strong></label>

          <br />

          <label>
            <input
              type="checkbox"
              name="formacontato"
              value="whatsapp"
              id="chk-wpp"
              checked
            />
            WhatsApp
          </label>

          <br />

          <label>
            <input
              type="checkbox"
              name="formacontato2"
              value="email"
              id="chk-email"
            />
            E-mail
          </label>
        </div>

        <br />

        <div class="msg-area">
          <label for="msg-contact"><strong>Mensagem:</strong></label>

          <br />

          <textarea
            name="msg-contact"
            id="msg-contact"
            cols="50"
            rows="10"
          ></textarea>
          <br /><br />

          <button type="submit" id="submit"><strong>Enviar</strong></button>
        </div>
      </fieldset>
    </form>
    )
}
