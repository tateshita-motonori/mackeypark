package com.internousdevwork.mackeypark.util;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * メインにて、ポップアップ表示を行うutilクラス
 * @author YUKI HOSHINO
 * @version 1.0
 * @since 1.0
 */
public class MainPopup extends JFrame implements ChangeListener{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = 6403662021988332159L;

    /**
     * ログインに誘導する文言が入力されたポップアップを表示するメソッド
     */
    public void NotLoggedPopup(){
        JLabel label = new JLabel("ログインしてないのでログイン画面に遷移します。");
        label.setForeground(Color.BLACK);
        JOptionPane.showMessageDialog(this, label);
    }

    /**
     * 条件選択に誘導する文言が入力されたポップアップを表示するメソッド
     */
    public void GoPurchasePopup(){
        JLabel label = new JLabel("購入画面に遷移します。");
        label.setForeground(Color.BLACK);
        JOptionPane.showMessageDialog(this, label);
    }

    /**
     * ログイン済みを知らせる文言が入力されたポップアップを表示するメソッド
     */
    public void AlreadyLoggedPopup(){
        JLabel label = new JLabel("ログイン済みです。メイン画面に遷移します。");
        label.setForeground(Color.BLACK);
        JOptionPane.showMessageDialog(this, label);
    }

    /**
     * 情報変更に誘導する文言が入力されたポップアップを表示するメソッド
     */
    public void NotCraditPopup(){
        JLabel label = new JLabel("ログイン済みですがクレジットカード情報が不足しています。マイページで登録してください。");
        label.setForeground(Color.BLACK);
        JOptionPane.showMessageDialog(this, label);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
    }

}
