/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.KhuyenMai;

import DTO.ChiTietDonHangDTO;
import DTO.DonHangDTO;
import DTO.SanPhamDTO;
import DTO.SanPhamKhuyenMaiDTO;
import GUI.Table.RenderTable;
import static GUI.TongQuanJPanel.customTable;
import static GUI.TongQuanJPanel.setJTableColumnsWidth;
import java.awt.BorderLayout;
import java.awt.Cursor;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import static quanlycuahangsach.Currency.changeCurrency;
import quanlycuahangsach.DateTime;

/**
 *
 * @author admin
 */
public class ThongTinChiTietKhuyenMaiTrongChuongTrinhKMJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ThongTinChiTietKhuyenMaiPanel
     */
    static DefaultTableModel listTableModel;
    static ArrayList<ChiTietDonHangDTO> currentChiTietDonHangList;
    static ArrayList<SanPhamDTO> currentSanPhamList;
    static ArrayList<SanPhamKhuyenMaiDTO> currentSanPhamKhuyenMaiList;
    static DonHangDTO currentDonHang;
    Object[] columnNames ={"Mã đơn hàng","Tạm tính","Giảm giá","Tổng","Ngày mua"};
    /**
     * Creates new form SanPhamJPanel
     */
    public void ShowTable(JTable table,Object[] columnName){
        
        table.setDefaultRenderer(Object.class, new RenderTable());
        listTableModel = new DefaultTableModel(columnNames,0);
        fetchAllDonHang();
    }     
    public void setShadow(){
        pnlThongTin.setShadow(1);
    }
    public static void fetchAllDonHang(){
        listTableModel.setRowCount(0);
        GUI.KhuyenMai.ThongTinChuongTrinhKhuyenMaiJPanel.currentDonHangList.forEach(DonHang -> {
            Vector row = new Vector();
            row.add(DonHang.getMaDonHang());
            row.add(changeCurrency(DonHang.getTamTinh()));
            row.add(changeCurrency(DonHang.getGiamGia()));
            row.add(changeCurrency(DonHang.getTongTien()));
            row.add(DateTime.TimestampToDateString(DonHang.getNgayXuat(),0));
            listTableModel.addRow(row);
        });
        tblDonHang.setModel(listTableModel);
    
    }
    public ThongTinChiTietKhuyenMaiTrongChuongTrinhKMJPanel() {
        initComponents();
        customTable(tblDonHang,scpDonHang);
        ShowTable(tblDonHang,columnNames);
        setJTableColumnsWidth(tblDonHang,890,20,20,20,20,20);   
        setShadow();
        setData();
        pnlQuayVe.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));       
        lblXem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));            
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
        lblThongTinMaKhuyenMai = new javax.swing.JLabel();
        scpDonHang = new javax.swing.JScrollPane();
        tblDonHang = new javax.swing.JTable(){
            public boolean isCellEditable ( int row, int col)
            {
                return false;
            }

        };
        lblDonHang = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTitleMaKhuyenMai = new javax.swing.JLabel();
        lblTitleDaDung = new javax.swing.JLabel();
        lblTitleNgayNhap = new javax.swing.JLabel();
        lblSoLuong = new javax.swing.JLabel();
        lblXem = new javax.swing.JLabel();
        lblTitleMaPhieuNhao = new javax.swing.JLabel();
        lblMaKhuyenMai = new javax.swing.JLabel();
        lblConLai = new javax.swing.JLabel();
        lblTitleSoLuong = new javax.swing.JLabel();
        lblDaDung = new javax.swing.JLabel();
        lblTitleConLai = new javax.swing.JLabel();
        lblGiaTienKhuyenMai = new javax.swing.JLabel();
        lblTitleMaChiTietKhuyenMai = new javax.swing.JLabel();
        lblMaChiTietKhuyenMai = new javax.swing.JLabel();
        lblTitlePhanTramKhuyenMai = new javax.swing.JLabel();
        lblTitleMaPhieuNhao3 = new javax.swing.JLabel();
        lblTitleMaPhieuNhao4 = new javax.swing.JLabel();
        lblTitleMaPhieuNhao5 = new javax.swing.JLabel();
        lblThoiGianKetThuc = new javax.swing.JLabel();
        lblPhanTramKhuyenMai = new javax.swing.JLabel();
        lblGiaTriSuDungToiThieu = new javax.swing.JLabel();
        lblGiamToiDa = new javax.swing.JLabel();
        lblTitleMaPhieuNhao7 = new javax.swing.JLabel();
        lblThoiGianBatDau = new javax.swing.JLabel();
        lblTitleMaChuongTrinhKhuyenMai = new javax.swing.JLabel();
        lblMaChuongTrinhKhuyenMai = new javax.swing.JLabel();
        pnlQuayVe = new GUI.Rounded();
        lblQuayVe = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 243, 247));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlThongTin.setBackground(new java.awt.Color(238, 243, 247));
        pnlThongTin.setForeground(new java.awt.Color(238, 243, 247));
        pnlThongTin.setPreferredSize(new java.awt.Dimension(920, 750));

        lblThongTinMaKhuyenMai.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblThongTinMaKhuyenMai.setForeground(new java.awt.Color(0, 146, 242));
        lblThongTinMaKhuyenMai.setText("Thông tin chi tiết khuyến mãi");

        scpDonHang.setForeground(new java.awt.Color(255, 255, 255));

        tblDonHang.setAutoCreateRowSorter(true);
        tblDonHang.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblDonHang.setFocusable(false);
        tblDonHang.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblDonHang.setRowHeight(25);
        tblDonHang.setSelectionBackground(new java.awt.Color(152, 210, 248));
        tblDonHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDonHangMouseClicked(evt);
            }
        });
        scpDonHang.setViewportView(tblDonHang);

        lblDonHang.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblDonHang.setForeground(new java.awt.Color(0, 146, 242));
        lblDonHang.setText("Đơn hàng sử dụng");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitleMaKhuyenMai.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleMaKhuyenMai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleMaKhuyenMai.setText("Mã khuyến mãi");
        jPanel1.add(lblTitleMaKhuyenMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        lblTitleDaDung.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleDaDung.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleDaDung.setText("Đã dùng:");
        jPanel1.add(lblTitleDaDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        lblTitleNgayNhap.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleNgayNhap.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleNgayNhap.setText("Sản phẩm được phép sử dụng:");
        jPanel1.add(lblTitleNgayNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        lblSoLuong.setForeground(new java.awt.Color(24, 24, 24));
        lblSoLuong.setText("500");
        jPanel1.add(lblSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        lblXem.setForeground(new java.awt.Color(0, 146, 242));
        lblXem.setText("Xem");
        lblXem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 146, 242)));
        lblXem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblXemMouseClicked(evt);
            }
        });
        jPanel1.add(lblXem, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        lblTitleMaPhieuNhao.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleMaPhieuNhao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleMaPhieuNhao.setText("Thời gian kết thúc:");
        jPanel1.add(lblTitleMaPhieuNhao, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 150, -1));

        lblMaKhuyenMai.setForeground(new java.awt.Color(24, 24, 24));
        lblMaKhuyenMai.setText("MAGIAMGIA2020");
        jPanel1.add(lblMaKhuyenMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        lblConLai.setForeground(new java.awt.Color(24, 24, 24));
        lblConLai.setText("0");
        jPanel1.add(lblConLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        lblTitleSoLuong.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleSoLuong.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleSoLuong.setText("Số lượng:");
        jPanel1.add(lblTitleSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        lblDaDung.setForeground(new java.awt.Color(24, 24, 24));
        lblDaDung.setText("500");
        jPanel1.add(lblDaDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 90, -1));

        lblTitleConLai.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleConLai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleConLai.setText("Còn lại:");
        jPanel1.add(lblTitleConLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        lblGiaTienKhuyenMai.setForeground(new java.awt.Color(24, 24, 24));
        lblGiaTienKhuyenMai.setText("50.000đ");
        jPanel1.add(lblGiaTienKhuyenMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, -1));

        lblTitleMaChiTietKhuyenMai.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleMaChiTietKhuyenMai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleMaChiTietKhuyenMai.setText("Mã chi tiết khuyến mãi:");
        jPanel1.add(lblTitleMaChiTietKhuyenMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 30));

        lblMaChiTietKhuyenMai.setForeground(new java.awt.Color(24, 24, 24));
        lblMaChiTietKhuyenMai.setText("KM123");
        jPanel1.add(lblMaChiTietKhuyenMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, 30));

        lblTitlePhanTramKhuyenMai.setForeground(new java.awt.Color(0, 52, 102));
        lblTitlePhanTramKhuyenMai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitlePhanTramKhuyenMai.setText("Phần trăm khuyến mãi:");
        jPanel1.add(lblTitlePhanTramKhuyenMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 150, -1));

        lblTitleMaPhieuNhao3.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleMaPhieuNhao3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleMaPhieuNhao3.setText("Giá tiền khuyến mãi:");
        jPanel1.add(lblTitleMaPhieuNhao3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 150, -1));

        lblTitleMaPhieuNhao4.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleMaPhieuNhao4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleMaPhieuNhao4.setText("Giá trị sử dụng tối thiểu:");
        jPanel1.add(lblTitleMaPhieuNhao4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 170, -1));

        lblTitleMaPhieuNhao5.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleMaPhieuNhao5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleMaPhieuNhao5.setText("Giá trị giảm tối đa:");
        jPanel1.add(lblTitleMaPhieuNhao5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 150, -1));

        lblThoiGianKetThuc.setForeground(new java.awt.Color(24, 24, 24));
        lblThoiGianKetThuc.setText("01/05/2000");
        jPanel1.add(lblThoiGianKetThuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, -1, -1));

        lblPhanTramKhuyenMai.setForeground(new java.awt.Color(24, 24, 24));
        lblPhanTramKhuyenMai.setText("15%");
        jPanel1.add(lblPhanTramKhuyenMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, -1));

        lblGiaTriSuDungToiThieu.setForeground(new java.awt.Color(24, 24, 24));
        lblGiaTriSuDungToiThieu.setText("300.000đ");
        jPanel1.add(lblGiaTriSuDungToiThieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, -1));

        lblGiamToiDa.setForeground(new java.awt.Color(24, 24, 24));
        lblGiamToiDa.setText("50.000đ");
        jPanel1.add(lblGiamToiDa, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, -1, -1));

        lblTitleMaPhieuNhao7.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleMaPhieuNhao7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleMaPhieuNhao7.setText("Thời gian bắt đầu:");
        jPanel1.add(lblTitleMaPhieuNhao7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 116, 150, 20));

        lblThoiGianBatDau.setForeground(new java.awt.Color(24, 24, 24));
        lblThoiGianBatDau.setText("01/05/2000");
        jPanel1.add(lblThoiGianBatDau, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        lblTitleMaChuongTrinhKhuyenMai.setForeground(new java.awt.Color(0, 52, 102));
        lblTitleMaChuongTrinhKhuyenMai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleMaChuongTrinhKhuyenMai.setText("Mã chương trình khuyến mãi:");
        jPanel1.add(lblTitleMaChuongTrinhKhuyenMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, -1));

        lblMaChuongTrinhKhuyenMai.setForeground(new java.awt.Color(24, 24, 24));
        lblMaChuongTrinhKhuyenMai.setText("CT123");
        jPanel1.add(lblMaChuongTrinhKhuyenMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        javax.swing.GroupLayout pnlThongTinLayout = new javax.swing.GroupLayout(pnlThongTin);
        pnlThongTin.setLayout(pnlThongTinLayout);
        pnlThongTinLayout.setHorizontalGroup(
            pnlThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scpDonHang, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblThongTinMaKhuyenMai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDonHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        pnlThongTinLayout.setVerticalGroup(
            pnlThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblThongTinMaKhuyenMai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDonHang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scpDonHang, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );

        add(pnlThongTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 70, 960, 600));

        pnlQuayVe.setBackground(new java.awt.Color(238, 243, 247));
        pnlQuayVe.setForeground(new java.awt.Color(0, 146, 242));
        pnlQuayVe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlQuayVeMouseClicked(evt);
            }
        });

        lblQuayVe.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblQuayVe.setForeground(new java.awt.Color(255, 255, 255));
        lblQuayVe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back-icon.png"))); // NOI18N
        lblQuayVe.setText("  Quay về");

        javax.swing.GroupLayout pnlQuayVeLayout = new javax.swing.GroupLayout(pnlQuayVe);
        pnlQuayVe.setLayout(pnlQuayVeLayout);
        pnlQuayVeLayout.setHorizontalGroup(
            pnlQuayVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuayVeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQuayVe, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlQuayVeLayout.setVerticalGroup(
            pnlQuayVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQuayVe, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        add(pnlQuayVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    
    private void setData(){
    lblMaChuongTrinhKhuyenMai.setText(GUI.KhuyenMai.ThongTinChuongTrinhKhuyenMaiJPanel.currentChiTietKhuyenMai.getMaChuongTrinhKhuyenMai());
    lblMaChiTietKhuyenMai.setText(GUI.KhuyenMai.ThongTinChuongTrinhKhuyenMaiJPanel.currentChiTietKhuyenMai.getMaChiTietKhuyenMai());
    lblMaKhuyenMai.setText(GUI.KhuyenMai.ThongTinChuongTrinhKhuyenMaiJPanel.currentChiTietKhuyenMai.getMaCode());
    lblSoLuong.setText(GUI.KhuyenMai.ThongTinChuongTrinhKhuyenMaiJPanel.currentChiTietKhuyenMai.getSoLuong());
    lblConLai.setText(Integer.parseInt(GUI.KhuyenMai.ThongTinChuongTrinhKhuyenMaiJPanel.currentChiTietKhuyenMai.getSoLuong())-Integer.parseInt(GUI.KhuyenMai.ThongTinChuongTrinhKhuyenMaiJPanel.currentChiTietKhuyenMai.getSoLuongDaDung())+"");
    lblDaDung.setText(GUI.KhuyenMai.ThongTinChuongTrinhKhuyenMaiJPanel.currentChiTietKhuyenMai.getSoLuongDaDung());
    lblPhanTramKhuyenMai.setText(GUI.KhuyenMai.ThongTinChuongTrinhKhuyenMaiJPanel.currentChiTietKhuyenMai.getPhanTramKhuyenMai());
    lblGiaTienKhuyenMai.setText(GUI.KhuyenMai.ThongTinChuongTrinhKhuyenMaiJPanel.currentChiTietKhuyenMai.getGiaTienKhuyenMai());
    lblGiaTriSuDungToiThieu.setText(GUI.KhuyenMai.ThongTinChuongTrinhKhuyenMaiJPanel.currentChiTietKhuyenMai.getGiaTriToiThieuSuDung());
    lblGiamToiDa.setText(GUI.KhuyenMai.ThongTinChuongTrinhKhuyenMaiJPanel.currentChiTietKhuyenMai.getGiaTriGiamToiDa());
    lblThoiGianBatDau.setText(DateTime.TimestampToDateString(GUI.KhuyenMai.ThongTinChuongTrinhKhuyenMaiJPanel.currentChiTietKhuyenMai.getThoiGianBatDauSuDung(),0));
    lblThoiGianKetThuc.setText(DateTime.TimestampToDateString(GUI.KhuyenMai.ThongTinChuongTrinhKhuyenMaiJPanel.currentChiTietKhuyenMai.getThoiGianKetThucSuDung(),0));
            }
    private void tblDonHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDonHangMouseClicked
        int column = tblDonHang.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/tblDonHang.getRowHeight();

        if(row < tblDonHang.getRowCount() && row >= 0 && column < tblDonHang.getColumnCount() && column >= 0){
                    
                    if (SwingUtilities.isLeftMouseButton(evt)){
                    currentChiTietDonHangList = quanlycuahangsach.quanlycuahangsach.ChiTietDonHangBUS.getListChiTietByMaDonHang(tblDonHang.getModel().getValueAt(row, 0).toString());
                    
                    currentSanPhamList = new ArrayList<>();
                    currentDonHang = quanlycuahangsach.quanlycuahangsach.DonHangBUS.getByMaDonHang(tblDonHang.getModel().getValueAt(row,0).toString());
                    currentChiTietDonHangList.forEach(ChiTietDonHang->{
                        currentSanPhamList.add(quanlycuahangsach.quanlycuahangsach.SachBUS.getByMaSanPham(ChiTietDonHang.getMaSanPham()));
                    });
                    this.removeAll();
                    this.setLayout(new BorderLayout());
                    this.add(new ChiTietDonHangTrongChuongTrinhJPanel());
                    this.validate();
                    this.repaint();
                             
            }

        }
    }//GEN-LAST:event_tblDonHangMouseClicked

    private void lblXemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXemMouseClicked
        if (SwingUtilities.isLeftMouseButton(evt)){
            currentSanPhamKhuyenMaiList = quanlycuahangsach.quanlycuahangsach.SanPhamKhuyenMaiBUS.getSanPhamKhuyenMai(GUI.KhuyenMai.ThongTinChuongTrinhKhuyenMaiJPanel.currentChiTietKhuyenMai.getMaChiTietKhuyenMai());
            new XemSanPhamTrongChuongTrinhKhuyenMaiJPanel().setVisible(true);
        }
    }//GEN-LAST:event_lblXemMouseClicked

    private void pnlQuayVeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlQuayVeMouseClicked
        if (SwingUtilities.isLeftMouseButton(evt)){
            this.removeAll();
            this.setLayout(new BorderLayout());
            this.add(new ThongTinChuongTrinhKhuyenMaiJPanel());
            this.validate();
            this.repaint();
        }// TODO add your handling code here:
    }//GEN-LAST:event_pnlQuayVeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblConLai;
    private javax.swing.JLabel lblDaDung;
    private javax.swing.JLabel lblDonHang;
    private javax.swing.JLabel lblGiaTienKhuyenMai;
    private javax.swing.JLabel lblGiaTriSuDungToiThieu;
    private javax.swing.JLabel lblGiamToiDa;
    private javax.swing.JLabel lblMaChiTietKhuyenMai;
    private javax.swing.JLabel lblMaChuongTrinhKhuyenMai;
    private javax.swing.JLabel lblMaKhuyenMai;
    private javax.swing.JLabel lblPhanTramKhuyenMai;
    private javax.swing.JLabel lblQuayVe;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblThoiGianBatDau;
    private javax.swing.JLabel lblThoiGianKetThuc;
    private javax.swing.JLabel lblThongTinMaKhuyenMai;
    private javax.swing.JLabel lblTitleConLai;
    private javax.swing.JLabel lblTitleDaDung;
    private javax.swing.JLabel lblTitleMaChiTietKhuyenMai;
    private javax.swing.JLabel lblTitleMaChuongTrinhKhuyenMai;
    private javax.swing.JLabel lblTitleMaKhuyenMai;
    private javax.swing.JLabel lblTitleMaPhieuNhao;
    private javax.swing.JLabel lblTitleMaPhieuNhao3;
    private javax.swing.JLabel lblTitleMaPhieuNhao4;
    private javax.swing.JLabel lblTitleMaPhieuNhao5;
    private javax.swing.JLabel lblTitleMaPhieuNhao7;
    private javax.swing.JLabel lblTitleNgayNhap;
    private javax.swing.JLabel lblTitlePhanTramKhuyenMai;
    private javax.swing.JLabel lblTitleSoLuong;
    private javax.swing.JLabel lblXem;
    private GUI.Rounded pnlQuayVe;
    private GUI.Rounded pnlThongTin;
    private javax.swing.JScrollPane scpDonHang;
    private static javax.swing.JTable tblDonHang;
    // End of variables declaration//GEN-END:variables
}
