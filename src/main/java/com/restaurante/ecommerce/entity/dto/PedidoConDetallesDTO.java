package com.restaurante.ecommerce.entity.dto;

import com.restaurante.ecommerce.entity.DetallePedido;
import com.restaurante.ecommerce.entity.Pedido;

import java.util.ArrayList;

public class PedidoConDetallesDTO {
    private Pedido pedido;
    private Iterable<DetallePedido> detallePedido;

    public PedidoConDetallesDTO() {
        this.pedido = new Pedido();
        this.detallePedido = new ArrayList<>();
    }

    public PedidoConDetallesDTO(Pedido pedido, Iterable<DetallePedido> detallePedido) {
        this.pedido = pedido;
        this.detallePedido = detallePedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Iterable<DetallePedido> getDetallePedido() {
        return detallePedido;
    }

    public void setDetallePedido(Iterable<DetallePedido> detallePedido) {
        this.detallePedido = detallePedido;
    }
}