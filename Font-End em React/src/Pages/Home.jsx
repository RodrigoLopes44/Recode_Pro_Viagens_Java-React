import { Link } from "react-router-dom";

import rj from '../Assets/Catalogo/RJ/ilha-grande-pousada.svg';
import sp from '../Assets/Catalogo/SP/pousada-vila-olimpia-SP.svg';
import mg from '../Assets/Catalogo/MG/pousada-pocos-de-caldas-MG.svg';
import ba from '../Assets/Catalogo/BA/pousada-ilheus-BA.svg'

export default function Home() {
    return (
        <>
            <div className="container-home">            
                <section className="gallery">
                    <div className="photos">
                        <img src= {rj} alt="Pic1" />
                        <img src= {sp} alt="Pic2" />
                        <img src= {mg} alt="Pic3" />
                        <img src= {ba} alt="Pic4" />
                    </div>
                </section>

                <br /><br />
                <hr />
                <br />

                <div className="content">
                    <h1 className="head-center">Você conhece a <u>Ponte da Saudade?</u></h1>
                    <br />
                
                    <p className="info-center">
                    Situada em Paquetá, a Ponte da Saudade tem esse nome porque, segundo a
                    lenda, era o porto onde os escravos eram desembarcados do navio
                    negreiro. <br />
                    Um desses escravos não suportou a perda da amada, que morreu durante a
                    viagem, e todo dia retornava à ponte para esperar que Iemanjá a
                    trouxesse de volta
                    </p>
                    <br /><br />
                
                    <h4 className="mid-center">
                        Não perca mais tempo e conheça agora nossos pacotes, clicando<Link to='/Viagens'> aqui!</Link>
                    
                    </h4>
                </div>
                <br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br />
            </div>            
        </>
    );
}