import promo1 from '../Assets/Catalogo/Promo/paquetá-ilha-grande-promo.svg';
import promo2 from '../Assets/Catalogo/Promo/poços-de-caldas-ilheus-promo.svg';

export default function Promocoes() {
    return(
        <>
            <div className="jumbotron jumbotron-fluid text-center" id="jumbo">
                <div className="container">
                    <h1 className="display-4">Programador consciente sabe a hora certa de aproveitar promoções!</h1>
                        <br /><br />
                    <p className="display-5">Que tal explorar nossas promoções atuais?!</p>

                    <hr className="my-2" />
                </div>
            </div>
            <section className="main">
                <div className="promo">
                    <img
                        src={promo1}
                        alt="Promoção para o RJ - Ilha Grande e Fernando de Noronha" />
                    <p>
                        Já pensou em passar uma temporada nos dois lugares mais cobiçados para
                        se viajar no Rio de Janeiro?
                    </p>

                    <p>
                        Pois agora você pode!
                        <br />
                        Com nossa promoção mais carioca da gema atualmente!
                    </p>

                    <button id="rj-promo">Adquirir</button>
                </div>

                <div className="promo">
                    <img
                        src={promo2}
                        alt="Promoção MG - BA (Ilhéus e Poços de Caldas)" />
                    <p>
                        Somente conosco você viaja de <strong> MINAS GERAIS</strong> até a
                        <strong>BAHIA!</strong>
                    </p>
                    <button id="ba-mg-promo">Adquirir</button>
                </div>
            </section>

            <div className="containerMais">
                <div className="info-rj">
                    <p>Promoção para você que quer se sentir carioca raíz por alguns dias!</p>
                    <p>Desfrute das praias mais belas do estado do RJ! <br /></p>
                    <p>Pacote Paquetá - Ilha Grande</p>

                    <p>
                    Desfrute de um descanso merecido nesses dois paraísos cariocas por
                    apenas <span> <strong> R$ 1000!</strong></span>
                    </p>
                    
                    <p>(O pacote inclui hospedagem e comida em ambos os lugares)</p>
                </div>
                
                <div className="info-ba-mg">
                
                    <p>O patrão ficou maluco?! Não mesmo!</p>
                    
                    <p>
                        Só aqui na Recode Tourism a gente leva você de
                        <strong> MINAS GERAIS</strong> até a <strong>BAHIA!</strong><br />
                    </p>
                
                    <p>Pacote Poços de Caldas - Ilhéus</p>

                    <p>
                        Desfrute de um descanso merecido nesses dois paraísos brasileiros por
                        apenas <span> <strong> R$ 2500!</strong></span>
                    </p>
                
                    <p>(O pacote inclui hospedagem, passagem e comida em ambos os lugares)</p>
                </div>
            </div>
        </>
    )
}