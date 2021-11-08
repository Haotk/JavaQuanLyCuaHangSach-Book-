/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI.DonHang;

import DTO.SanPhamDTO;
import GUI.Sweet.SweetComboBox;
import GUI.Table.RenderTable;
import GUI.Table.setIconForCell;
import static GUI.TongQuanJPanel.customTable;
import static GUI.TongQuanJPanel.setJTableColumnsWidth;
import java.awt.BorderLayout;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static quanlycuahangsach.Currency.changeCurrency;
import quanlycuahangsach.DateTime;

/**
 *
 * @author admin
 */
public class SuaDonHangJPanel extends javax.swing.JPanel {
    SweetComboBox cbxTrangThai;
    Object[] columnNames ={"Sản phẩm","Số lượng","Đơn giá","Tạm tính",""};
    public void setShadow(){
        pnlThongTin.setShadow(1);
        pnlTblDonHangChuaXacNhan1.setShadow(1);
        pnlTinhToan.setShadow(1);
    }
    public void setData(){
        lblMaDonHang.setText(GUI.DonHangJPanel.currentDonHang.getMaDonHang());
        lblHoTen.setText(GUI.DonHangJPanel.currentKhachHang.getHoTen());
        lblEmail.setText(GUI.DonHangJPanel.currentKhachHang.getEmail());
        lblSoDienThoai.setText(GUI.DonHangJPanel.currentKhachHang.getSoDienThoai());
        lblNgayDat.setText(DateTime.TimestampToDateString(GUI.DonHangJPanel.currentDonHang.getNgayXuat(),0));
        lblMaGiamGia.setText(GUI.DonHangJPanel.currentDonHang.getMaCode());
        cbxTrangThai.setSelectedIndex(Integer.parseInt(GUI.DonHangJPanel.currentDonHang.getTrangThai()));
            lblTamTinh.setText(changeCurrency(GUI.DonHangJPanel.currentDonHang.getTamTinh())+"đ");
            lblGiamGia.setText(changeCurrency(GUI.DonHangJPanel.currentDonHang.getGiamGia())+"đ");
            lblPhiVanChuyen.setText(changeCurrency(GUI.DonHangJPanel.currentDonHang.getPhiVanChuyen())+"đ");
            lblTongTien.setText(changeCurrency(GUI.DonHangJPanel.currentDonHang.getTongTien())+"đ");
        lblDiaChi.setText(GUI.DonHangJPanel.currentKhachHang.getDiaChi());
    }
    public static String getTrangThai(String MaTrangThai){
        return MaTrangThai.equals("1") ? "Thành Công" : "Hủy";
    }
    
    public String getGiaTriTrangThai(String currentTrangThai){
        return currentTrangThai.equals("Hủy") ? "0" : "1";
    }

        
    public void ShowTable(JTable table,Object[] columnName){
        
        table.setDefaultRenderer(Object.class, new RenderTable());
        tblSanPham.setModel(GUI.DonHang.ChiTietDonHangJPanel.listTableModel);
    }
   
    public void setComboBox(){
        String[] trangthai = {"Hủy","Thành công"};
        cbxTrangThai = new SweetComboBox("#ffffff","#181818",0,0,130,30,trangthai);
        pnlTrangThai.add(cbxTrangThai);
        
    }   
    
    public SuaDonHangJPanel() {
        initComponents();
            customTable(tblSanPham,scpSanPham);
            ShowTable(tblSanPham,columnNames);
            setComboBox();  
            setJTableColumnsWidth(tblSanPham,961,20,30,10,20,20,5);
            setShadow();
            setData();
            pnlXacNhan.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlThongTin = new GUI.Rounded();
        lblTitleMaDonHang = new javax.swing.JLabel();
        lblTitleHoTen = new javax.swing.JLabel();
        lblTitleEmail = new javax.swing.JLabel();
        lblTitleSoDienThoai = new javax.swing.JLabel();
        lblTitleDiaChi = new javax.swing.JLabel();
        lblMaDonHang = new javax.swing.JLabel();
        lblTitleNgayDat = new javax.swing.JLabel();
        lblTitleMaGiamGia1 = new javax.swing.JLabel();
        lblNgayDat = new javax.swing.JLabel();
        pnlTrangThai = new javax.swing.JPanel();
        lblTitleTrangThai = new javax.swing.JLabel();
        lblMaGiamGia = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSoDienThoai = new javax.swing.JLabel();
        lblDiaChi = new javax.swing.JLabel();
        pnlTblDonHangChuaXacNhan1 = new GUI.Rounded();
        scpSanPham = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable(){
            public boolean isCellEditable ( int row, int col)
            {
                return false;
            }
        };
        pnlTinhToan = new GUI.Rounded();
        lblTitleTamTinh = new javax.swing.JLabel();
        lblTitleMaGiamGia = new javax.swing.JLabel();
        lblTitlePhiVanChuyen = new javax.swing.JLabel();
        lblTitleTong = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        lblPhiVanChuyen = new javax.swing.JLabel();
        lblGiamGia = new javax.swing.JLabel();
        lblTamTinh = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlXacNhan = new GUI.Rounded();
        lblXacNhan = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 243, 247));
        setPreferredSize(new java.awt.Dimension(1040, 690));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlThongTin.setBackground(new java.awt.Color(238, 243, 247));
        pnlThongTin.setForeground(new java.awt.Color(238, 243, 247));
        pnlThongTin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitleMaDonHang.setForeground(new java.awt.Color(192, 192, 192));
        lblTitleMaDonHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleMaDonHang.setText("Mã đơn hàng:");
        pnlThongTin.add(lblTitleMaDonHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 90, -1));

        lblTitleHoTen.setForeground(new java.awt.Color(192, 192, 192));
        lblTitleHoTen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleHoTen.setText("Họ tên:");
        pnlThongTin.add(lblTitleHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 50, -1));

        lblTitleEmail.setForeground(new java.awt.Color(192, 192, 192));
        lblTitleEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleEmail.setText("Email:");
        pnlThongTin.add(lblTitleEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        lblTitleSoDienThoai.setForeground(new java.awt.Color(192, 192, 192));
        lblTitleSoDienThoai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleSoDienThoai.setText("Số điện thoại:");
        pnlThongTin.add(lblTitleSoDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        lblTitleDiaChi.setForeground(new java.awt.Color(192, 192, 192));
        lblTitleDiaChi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleDiaChi.setText("Địa chỉ:");
        pnlThongTin.add(lblTitleDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        lblMaDonHang.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblMaDonHang.setForeground(new java.awt.Color(210, 48, 44));
        lblMaDonHang.setText("12345");
        pnlThongTin.add(lblMaDonHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, 20));

        lblTitleNgayDat.setForeground(new java.awt.Color(192, 192, 192));
        lblTitleNgayDat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleNgayDat.setText("Ngày đặt:");
        pnlThongTin.add(lblTitleNgayDat, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 70, -1));

        lblTitleMaGiamGia1.setForeground(new java.awt.Color(192, 192, 192));
        lblTitleMaGiamGia1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleMaGiamGia1.setText("Mã giảm giá:");
        pnlThongTin.add(lblTitleMaGiamGia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, -1, -1));

        lblNgayDat.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblNgayDat.setForeground(new java.awt.Color(24, 24, 24));
        lblNgayDat.setText("01/05/2000");
        pnlThongTin.add(lblNgayDat, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, -1, -1));

        pnlTrangThai.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlTrangThaiLayout = new javax.swing.GroupLayout(pnlTrangThai);
        pnlTrangThai.setLayout(pnlTrangThaiLayout);
        pnlTrangThaiLayout.setHorizontalGroup(
            pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        pnlTrangThaiLayout.setVerticalGroup(
            pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlThongTin.add(pnlTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, -1, -1));

        lblTitleTrangThai.setForeground(new java.awt.Color(192, 192, 192));
        lblTitleTrangThai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleTrangThai.setText("Trạng thái:");
        pnlThongTin.add(lblTitleTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 80, -1));

        lblMaGiamGia.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblMaGiamGia.setForeground(new java.awt.Color(0, 52, 102));
        lblMaGiamGia.setText("MAGIAMGIA2020");
        pnlThongTin.add(lblMaGiamGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, -1, -1));

        lblHoTen.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblHoTen.setForeground(new java.awt.Color(24, 24, 24));
        lblHoTen.setText("PHAN CONG HA");
        pnlThongTin.add(lblHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        lblEmail.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(24, 24, 24));
        lblEmail.setText("phancongha24@gmail.com");
        pnlThongTin.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        lblSoDienThoai.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblSoDienThoai.setForeground(new java.awt.Color(24, 24, 24));
        lblSoDienThoai.setText("0913175755");
        pnlThongTin.add(lblSoDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        lblDiaChi.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblDiaChi.setForeground(new java.awt.Color(24, 24, 24));
        lblDiaChi.setText("0913175755");
        pnlThongTin.add(lblDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        add(pnlThongTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 973, 200));

        pnlTblDonHangChuaXacNhan1.setBackground(new java.awt.Color(238, 243, 247));
        pnlTblDonHangChuaXacNhan1.setForeground(new java.awt.Color(238, 243, 247));

        tblSanPham.setAutoCreateRowSorter(true);
        tblSanPham.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblSanPham.setForeground(new java.awt.Color(24, 24, 24));
        tblSanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblSanPham.setFocusable(false);
        tblSanPham.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblSanPham.setRowHeight(50);
        tblSanPham.setSelectionBackground(new java.awt.Color(152, 210, 248));
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        scpSanPham.setViewportView(tblSanPham);

        javax.swing.GroupLayout pnlTblDonHangChuaXacNhan1Layout = new javax.swing.GroupLayout(pnlTblDonHangChuaXacNhan1);
        pnlTblDonHangChuaXacNhan1.setLayout(pnlTblDonHangChuaXacNhan1Layout);
        pnlTblDonHangChuaXacNhan1Layout.setHorizontalGroup(
            pnlTblDonHangChuaXacNhan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTblDonHangChuaXacNhan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scpSanPham)
                .addContainerGap())
        );
        pnlTblDonHangChuaXacNhan1Layout.setVerticalGroup(
            pnlTblDonHangChuaXacNhan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTblDonHangChuaXacNhan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scpSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(pnlTblDonHangChuaXacNhan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 973, 280));

        pnlTinhToan.setBackground(new java.awt.Color(238, 243, 247));
        pnlTinhToan.setForeground(new java.awt.Color(238, 243, 247));
        pnlTinhToan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitleTamTinh.setBackground(new java.awt.Color(192, 192, 192));
        lblTitleTamTinh.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleTamTinh.setText("Tạm tính");
        pnlTinhToan.add(lblTitleTamTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lblTitleMaGiamGia.setBackground(new java.awt.Color(192, 192, 192));
        lblTitleMaGiamGia.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleMaGiamGia.setText("Mã giảm giá");
        pnlTinhToan.add(lblTitleMaGiamGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        lblTitlePhiVanChuyen.setBackground(new java.awt.Color(192, 192, 192));
        lblTitlePhiVanChuyen.setForeground(new java.awt.Color(0, 52, 102));
        lblTitlePhiVanChuyen.setText("Phí vận chuyển");
        pnlTinhToan.add(lblTitlePhiVanChuyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        lblTitleTong.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblTitleTong.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleTong.setText("Tổng");
        pnlTinhToan.add(lblTitleTong, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        lblTongTien.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTongTien.setForeground(new java.awt.Color(210, 48, 44));
        lblTongTien.setText("3.600.000đ");
        pnlTinhToan.add(lblTongTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        lblPhiVanChuyen.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblPhiVanChuyen.setForeground(new java.awt.Color(24, 24, 24));
        lblPhiVanChuyen.setText("3.600.000đ");
        pnlTinhToan.add(lblPhiVanChuyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        lblGiamGia.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblGiamGia.setForeground(new java.awt.Color(24, 24, 24));
        lblGiamGia.setText("3.600.000đ");
        pnlTinhToan.add(lblGiamGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        lblTamTinh.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTamTinh.setForeground(new java.awt.Color(24, 24, 24));
        lblTamTinh.setText("3.600.000đ");
        pnlTinhToan.add(lblTamTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        add(pnlTinhToan, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 570, 280, 110));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 52, 102));
        jLabel3.setText("Sản phẩm");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, 39));

        pnlXacNhan.setBackground(new java.awt.Color(238, 243, 247));
        pnlXacNhan.setForeground(new java.awt.Color(34, 212, 52));
        pnlXacNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlXacNhanMouseClicked(evt);
            }
        });

        lblXacNhan.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblXacNhan.setForeground(new java.awt.Color(255, 255, 255));
        lblXacNhan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblXacNhan.setText("Xác nhận");

        javax.swing.GroupLayout pnlXacNhanLayout = new javax.swing.GroupLayout(pnlXacNhan);
        pnlXacNhan.setLayout(pnlXacNhanLayout);
        pnlXacNhanLayout.setHorizontalGroup(
            pnlXacNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlXacNhanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlXacNhanLayout.setVerticalGroup(
            pnlXacNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlXacNhanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblXacNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(pnlXacNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void pnlXacNhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlXacNhanMouseClicked
        if(changeTrangThai()){
            System.out.println("change true");
            if(cbxTrangThai.getSelectedIndex()==0){
                for(int i=0;i<GUI.DonHangJPanel.currentChiTietDonHangList.size();i++){
                    SanPhamDTO sanpham = quanlycuahangsach.quanlycuahangsach.SachBUS.getByMaSanPham(GUI.DonHangJPanel.currentChiTietDonHangList.get(i).getMaSanPham());
                    sanpham.setSoLuong(Integer.toString(Integer.parseInt(sanpham.getSoLuong())+Integer.parseInt(GUI.DonHangJPanel.currentChiTietDonHangList.get(i).getSoLuong())));
                    quanlycuahangsach.quanlycuahangsach.SachBUS.edit(sanpham);
                }
                System.out.println("Huy");
            } else {
                for(int i=0;i<GUI.DonHangJPanel.currentChiTietDonHangList.size();i++){
                    SanPhamDTO sanpham = quanlycuahangsach.quanlycuahangsach.SachBUS.getByMaSanPham(GUI.DonHangJPanel.currentChiTietDonHangList.get(i).getMaSanPham());
                    sanpham.setSoLuong(Integer.toString(Integer.parseInt(sanpham.getSoLuong())-Integer.parseInt(GUI.DonHangJPanel.currentChiTietDonHangList.get(i).getSoLuong())));
                    quanlycuahangsach.quanlycuahangsach.SachBUS.edit(sanpham);
                }
                System.out.println("Huy");
            } 
        } else System.out.println("change false");
        GUI.DonHangJPanel.currentDonHang.setTrangThai(cbxTrangThai.getSelectedIndex()+"");
        quanlycuahangsach.quanlycuahangsach.DonHangBUS.edit(GUI.DonHangJPanel.currentDonHang);
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(new ChiTietDonHangJPanel());
        this.validate();
        this.repaint();
    }//GEN-LAST:event_pnlXacNhanMouseClicked

    public boolean changeTrangThai(){
        return (GUI.DonHangJPanel.currentDonHang.getTrangThai().equals(cbxTrangThai.getSelectedIndex()+"")) ? false : true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGiamGia;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMaDonHang;
    private javax.swing.JLabel lblMaGiamGia;
    private javax.swing.JLabel lblNgayDat;
    private javax.swing.JLabel lblPhiVanChuyen;
    private javax.swing.JLabel lblSoDienThoai;
    private javax.swing.JLabel lblTamTinh;
    private javax.swing.JLabel lblTitleDiaChi;
    private javax.swing.JLabel lblTitleEmail;
    private javax.swing.JLabel lblTitleHoTen;
    private javax.swing.JLabel lblTitleMaDonHang;
    private javax.swing.JLabel lblTitleMaGiamGia;
    private javax.swing.JLabel lblTitleMaGiamGia1;
    private javax.swing.JLabel lblTitleNgayDat;
    private javax.swing.JLabel lblTitlePhiVanChuyen;
    private javax.swing.JLabel lblTitleSoDienThoai;
    private javax.swing.JLabel lblTitleTamTinh;
    private javax.swing.JLabel lblTitleTong;
    private javax.swing.JLabel lblTitleTrangThai;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JLabel lblXacNhan;
    private GUI.Rounded pnlTblDonHangChuaXacNhan1;
    private GUI.Rounded pnlThongTin;
    private GUI.Rounded pnlTinhToan;
    private javax.swing.JPanel pnlTrangThai;
    private GUI.Rounded pnlXacNhan;
    private javax.swing.JScrollPane scpSanPham;
    private static javax.swing.JTable tblSanPham;
    // End of variables declaration//GEN-END:variables
}