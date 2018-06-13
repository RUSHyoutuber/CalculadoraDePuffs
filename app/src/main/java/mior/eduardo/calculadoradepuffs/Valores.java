package mior.eduardo.calculadoradepuffs;

import android.widget.EditText;

public class Valores {

    public static EditText ParafusoFrancesQuantia;
    public static EditText ParafusoFrancesValor;
    public static EditText ParafusoCabecaChataQuantia;
    public static EditText ParafusoCabecaChataValor;
    public static EditText ParafusoSextavadoQuantia;
    public static EditText ParafusoSextavadoValor;
    public static EditText PneuQuantia;
    public static EditText PneuValor;
    public static EditText PesQuantia;
    public static EditText PesValor;
    public static EditText RuelasQuantia;
    public static EditText RuelasValor;
    public static EditText PorcasQuantia;
    public static EditText PorcasValor;
    public static EditText ChapaLargura;
    public static EditText ChapaComprimento;
    public static EditText ChapaValorAoMetro;
    public static EditText TecidoForroComprimento;
    public static EditText TecidoForroLargura;
    public static EditText TecidoForroValorAoMetro;
    public static EditText EspumaLargura;
    public static EditText EspumaComprimento;
    public static EditText EspumaValorAoMetro;
    public static EditText FuradeiraTempo;
    public static EditText FuradeiraPotencia;
    public static EditText ParafusadeiraTempo;
    public static EditText ParafusadeiraPotencia;
    public static EditText SerraTempo;
    public static EditText SerraPotencia;
    public static EditText outros;

    public static EditText valorPrecoUnitario;
    public static EditText quantiaPrecoUnitario;

    public static EditText valorTotalMetroQuadrado;
    public static EditText comprimentoMetroQuadrado;
    public static EditText larguraMetroQuadrado;

    private static double calcularParafusoFrances() {
        int ParafusoFrancesQTD;
        double ParafusoFrancesCusto;
        double ParafusoFancesTotal;

        try {
            ParafusoFrancesQTD = Integer.parseInt(ParafusoFrancesQuantia.getText().toString());
        } catch (Exception e) {
            ParafusoFrancesQTD = 0;
        }

        try {
            ParafusoFrancesCusto = Double.parseDouble(ParafusoFrancesValor.getText().toString());
        } catch (Exception e) {
            ParafusoFrancesCusto = 0;
        }

        ParafusoFancesTotal = ParafusoFrancesQTD * ParafusoFrancesCusto;
        return ParafusoFancesTotal;
    }

    private static double calcularParafusoCabecaChata() {
        int ParafusoCabecaChataQTD;
        double ParafusoCabecaChataCusto;
        double ParafusoCabecaChataTotal;

        try {
            ParafusoCabecaChataQTD = Integer.parseInt(ParafusoCabecaChataQuantia.getText().toString());
        } catch (Exception e) {
            ParafusoCabecaChataQTD = 0;
        }

        try {
            ParafusoCabecaChataCusto = Double.parseDouble(ParafusoCabecaChataValor.getText().toString());
        } catch (Exception e) {
            ParafusoCabecaChataCusto = 0;
        }

        ParafusoCabecaChataTotal = ParafusoCabecaChataQTD * ParafusoCabecaChataCusto;
        return ParafusoCabecaChataTotal;
    }

    private static double calcularParafusoSextavado() {
        int ParafusoSextavadoQTD;
        double ParafusoSextavadoCusto;
        double ParafusoSextavadoTotal;

        try {
            ParafusoSextavadoQTD = Integer.parseInt(ParafusoSextavadoQuantia.getText().toString());
        } catch (Exception e) {
            ParafusoSextavadoQTD = 0;
        }

        try {
            ParafusoSextavadoCusto = Double.parseDouble(ParafusoSextavadoValor.getText().toString());
        } catch (Exception e) {
            ParafusoSextavadoCusto = 0;
        }

        ParafusoSextavadoTotal = ParafusoSextavadoQTD * ParafusoSextavadoCusto;
        return ParafusoSextavadoTotal;
    }

    private static double calcularPneus() {
        int PneusQTD;
        double PneusCusto;
        double PneusTotal;

        try {
            PneusQTD = Integer.parseInt(PneuQuantia.getText().toString());
        } catch (Exception e) {
            PneusQTD = 0;
        }

        try {
            PneusCusto = Double.parseDouble(PneuValor.getText().toString());
        } catch (Exception e) {
            PneusCusto = 0;
        }

        PneusTotal = PneusQTD * PneusCusto;
        return PneusTotal;
    }

    private static double calcularPes() {
        int PesQTD;
        double PesCusto;
        double PesTotal;

        try {
            PesQTD = Integer.parseInt(PesQuantia.getText().toString());
        } catch (Exception e) {
            PesQTD = 0;
        }

        try {
            PesCusto = Double.parseDouble(PesValor.getText().toString());
        } catch (Exception e) {
            PesCusto = 0;
        }

        PesTotal = PesQTD * PesCusto;
        return PesTotal;
    }

    private static double calcularRuelas() {
        int RuelasQTD;
        double RuelasCusto;
        double RuelasTotal;

        try {
            RuelasQTD = Integer.parseInt(RuelasQuantia.getText().toString());
        } catch (Exception e) {
            RuelasQTD = 0;
        }

        try {
            RuelasCusto = Double.parseDouble(RuelasValor.getText().toString());
        } catch (Exception e) {
            RuelasCusto = 0;
        }

        RuelasTotal = RuelasQTD * RuelasCusto;
        return RuelasTotal;
    }

    private static double calcularPorcas() {
        int PorcasQTD;
        double PorcasCusto;
        double PorcasTotal;

        try {
            PorcasQTD = Integer.parseInt(PorcasQuantia.getText().toString());
        } catch (Exception e) {
            PorcasQTD = 0;
        }

        try {
            PorcasCusto = Double.parseDouble(PorcasValor.getText().toString());
        } catch (Exception e) {
            PorcasCusto = 0;
        }

        PorcasTotal = PorcasQTD * PorcasCusto;
        return PorcasTotal;
    }

    private static double calcularChapa() {
        double ChapaComprimentoM;
        double ChapaLarguraM;
        double ChapaCusto;
        double ChapaTotal;

        try {
            ChapaComprimentoM = Double.parseDouble(ChapaComprimento.getText().toString());
        } catch (Exception e) {
            ChapaComprimentoM = 0;
        }

        try {
            ChapaLarguraM = Double.parseDouble(ChapaLargura.getText().toString());
        } catch (Exception e) {
            ChapaLarguraM = 0;
        }

        try {
            ChapaCusto = Double.parseDouble(ChapaValorAoMetro.getText().toString());
        } catch (Exception e) {
            ChapaCusto = 0;
        }

        ChapaTotal = (ChapaComprimentoM * ChapaLarguraM) * ChapaCusto;
        return ChapaTotal;
    }

    private static double calcularTecidoForro() {
        double TecidoForroComprimentoM;
        double TecidoForroLarguraM;
        double TecidoForroCusto;
        double TecidoForroTotal;

        try {
            TecidoForroComprimentoM = Double.parseDouble(TecidoForroComprimento.getText().toString());
        } catch (Exception e) {
            TecidoForroComprimentoM = 0;
        }

        try {
            TecidoForroLarguraM = Double.parseDouble(TecidoForroLargura.getText().toString());
        } catch (Exception e) {
            TecidoForroLarguraM = 0;
        }

        try {
            TecidoForroCusto = Double.parseDouble(TecidoForroValorAoMetro.getText().toString());
        } catch (Exception e) {
            TecidoForroCusto = 0;
        }

        TecidoForroTotal = (TecidoForroComprimentoM * TecidoForroLarguraM) * TecidoForroCusto;
        return TecidoForroTotal;
    }

    private static double calcularEspuma() {
        double EspumaComprimentoM;
        double EspumaLarguraM;
        double EspumaCusto;
        double EspumaTotal;

        try {
            EspumaComprimentoM = Double.parseDouble(EspumaComprimento.getText().toString());
        } catch (Exception e) {
            EspumaComprimentoM = 0;
        }

        try {
            EspumaLarguraM = Double.parseDouble(EspumaLargura.getText().toString());
        } catch (Exception e) {
            EspumaLarguraM = 0;
        }

        try {
            EspumaCusto = Double.parseDouble(EspumaValorAoMetro.getText().toString());
        } catch (Exception e) {
            EspumaCusto = 0;
        }

        EspumaTotal = (EspumaComprimentoM * EspumaLarguraM) * EspumaCusto;
        return EspumaTotal;
    }

    private static double calcularFuradeira() {
        double FuradeiraMin;
        double FuradeiraWatts;
        double FuradeiraTotal;

        try {
            FuradeiraMin = Double.parseDouble(FuradeiraTempo.getText().toString());
        } catch (Exception e) {
            FuradeiraMin = 0;
        }

        try {
            FuradeiraWatts = Double.parseDouble(FuradeiraPotencia.getText().toString());
        } catch (Exception e) {
            FuradeiraWatts = 0;
        }

        FuradeiraTotal = ((FuradeiraWatts / 1000) * (FuradeiraMin / 60)) * 0.75;
        return FuradeiraTotal;
    }

    private static double calcularParafusadeira() {
        double ParafusadeiraMin;
        double ParafusadeiraWatts;
        double ParafusadeiraTotal;

        try {
            ParafusadeiraMin = Double.parseDouble(ParafusadeiraTempo.getText().toString());
        } catch (Exception e) {
            ParafusadeiraMin = 0;
        }

        try {
            ParafusadeiraWatts = Double.parseDouble(ParafusadeiraPotencia.getText().toString());
        } catch (Exception e) {
            ParafusadeiraWatts = 0;
        }

        ParafusadeiraTotal = ((ParafusadeiraWatts / 1000) * (ParafusadeiraMin / 60)) * 0.75;
        return ParafusadeiraTotal;
    }

    private static double calcularSerra() {
        double SerraMin;
        double SerraWatts;
        double SerraTotal;

        try {
            SerraMin = Double.parseDouble(SerraTempo.getText().toString());
        } catch (Exception e) {
            SerraMin = 0;
        }

        try {
            SerraWatts = Double.parseDouble(SerraPotencia.getText().toString());
        } catch (Exception e) {
            SerraWatts = 0;
        }

        SerraTotal = ((SerraWatts / 1000) * (SerraMin / 60)) * 0.75;
        return SerraTotal;
    }

    private static double calcularOutros() {
        double outrosTotal;

        try {
           outrosTotal = Double.parseDouble(outros.getText().toString());
        } catch (Exception e) {
            outrosTotal = 0;
        }

        return outrosTotal;
    }

    public static double calcularTotal() {
        double total = calcularParafusoFrances() + calcularParafusoCabecaChata() + calcularParafusoSextavado() +
                       calcularPneus() + calcularPes() +calcularRuelas() + calcularPorcas() +  calcularChapa() +
                       calcularTecidoForro() + calcularEspuma() + calcularFuradeira() + calcularParafusadeira() +
                       calcularSerra() + calcularOutros();
        return total;
    }

    //

    public static double calcularPrecoUnitario() {
        double valorPrecoUnitario;
        double quantiaPrecoUnitario;
        double precoUnitario;

        try {
            valorPrecoUnitario = Double.parseDouble(Valores.valorPrecoUnitario.getText().toString());
        } catch (Exception e) {
            valorPrecoUnitario = 0;
        }

        try {
            quantiaPrecoUnitario = Double.parseDouble(Valores.quantiaPrecoUnitario.getText().toString());
        } catch (Exception e) {
            quantiaPrecoUnitario = 0;
        }

        precoUnitario = valorPrecoUnitario / quantiaPrecoUnitario;
        return precoUnitario;
    }

    //

    public static double calcularPrecoMetroQuadrado() {
        double larguraMetroQuadrado;
        double comprimentoMetroQuadrado;
        double valorTotalMetroQuadrado;
        double precoMetroQuadrado;

        try {
            larguraMetroQuadrado = Double.parseDouble(Valores.larguraMetroQuadrado.getText().toString());
        } catch (Exception e) {
            larguraMetroQuadrado = 0;
        }

        try {
            comprimentoMetroQuadrado = Double.parseDouble(Valores.comprimentoMetroQuadrado.getText().toString());
        } catch (Exception e) {
            comprimentoMetroQuadrado = 0;
        }

        try {
            valorTotalMetroQuadrado = Double.parseDouble(Valores.valorTotalMetroQuadrado.getText().toString());
        } catch (Exception e) {
            valorTotalMetroQuadrado = 0;
        }

        precoMetroQuadrado =  valorTotalMetroQuadrado / (larguraMetroQuadrado * comprimentoMetroQuadrado);
        return precoMetroQuadrado;
    }
}