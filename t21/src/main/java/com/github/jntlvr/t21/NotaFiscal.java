package com.github.jntlvr.t21;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Set;

public class NotaFiscal {
    private Set<Pedido> referencia;
    private Set<Pagamento> pagamentos;
    private LocalTime horaEntrega;

    public NotaFiscal(LocalTime horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public LocalTime getHoraEntrega() {
        return horaEntrega;
    }

    public Preco total() {
        Preco total = Preco.reais(0);
        for (Pagamento pagamento : pagamentos) {
            total = total.adiciona(pagamento.valor());
        }
        return total;
    }

    public Duration calcularTempoGasto() {
        if (horaEntrega != null && !referencia.isEmpty()) {
            Pedido pedido = referencia.iterator().next();
            return Duration.between(pedido.getHoraPedido(), horaEntrega);
        }
        return Duration.ZERO;
    }

}
