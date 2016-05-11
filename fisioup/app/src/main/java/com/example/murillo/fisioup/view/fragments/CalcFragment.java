package com.example.murillo.fisioup.view.fragments;

/**
 * Created by Rodrigo on 10/05/2016.
 */
public class CalcFragment {

    public double result;

        public double indiceOxigenacao (double pao, double fio){

            if (pao > 0 && fio > 0){

                result = pao/fio;

                return result;

                /* Resultados:           result >= 300   Normalidade
                                   200 >= result <= 300   Lesão Pulmonar Aguda (LPA)
                                         result <= 200   Lesão Pulmonar Grave (SARA)
                */
            }

            else
            return -1;
        };

        public double oxigenioIdeal(double idade){

            if(110 > idade && idade > 0){

                result = 109 - (idade * 0.43);

                /* Resultados: A PaO2 ideal é por volta 80mmHg, pois garante uma saturação
                de 95% em condições normais
                */
                return result;
            }

            else
            return -1;
        }

        public double indiceRRS (double fr, double vc){

            if(fr > 0 && vc > 0){

                result = fr / vc;
                return result;

                /*  IRRS <= 105 IRPM indica normalidade = Preditivo de sucesso de desmame
                    IRRS >= 105 NÃO indicado inciciação de desmame

                    ** alguns autores consideram <= 104 como indice de comparação
                 */
            }

            else
            return -1;
        }

    public double complacidadePulmonarEstatica(double volcorrente, double pressaoplato, double peep){

        if(volcorrente > 0 && pressaoplato > 0 && peep > 0){

            result = volcorrente / (pressaoplato - peep);

            return result;

                /*  Valor Normal: 50 >= result >= 100 mL/cmH20

                    *Niveis Superiores a 30 mL/cmH20  são preditivos de desmame bem suscedido
                 */
        }

        else
            return -1;
    }

    public double complacidadePulmonarDinamica (double volcorrente, double pressaopico, double peep){

        if(volcorrente > 0 && pressaopico > 0 && peep > 0){

            result = volcorrente / (pressaopico - peep);

            return result;
                /*  Valor Normal: 100 >= result >= 200 mL/cmH20

                    *Niveis Superiores a 30 mL/cmH20  são preditivos de desmame bem suscedido
                 */
        }

        else
            return -1;
    }

    public double elastancia (double pressaoplato, double peep, double volcorrente){
        if(pressaoplato > 0 && peep > 0 && volcorrente > 0){

            result = (pressaoplato - peep)/ volcorrente;
            return result;
            /*  Retorna o valor de elastância
             */
        }

        else
        return -1;
    }

    public double resistenciaSistemaPulmonar( double pressaopico, double pressaoplato, double fluxo){

        if(pressaopico > 0 && pressaoplato > 0 && fluxo > 0){

            result = (pressaopico - pressaoplato)/fluxo;
            return result;

            /*Valor Normal: 4 >= result >= 7 cmH2O/L/s
             */
        }
        else
        return -1;
    }

    public double pressaoInspiratoriaMaximaHomens(double idade){
        if(idade > 0){
            result =
        }
    }
}



