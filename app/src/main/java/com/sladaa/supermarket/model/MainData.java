
package com.sladaa.supermarket.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class MainData {

    @SerializedName("currency")
    private String mCurrency;
    @SerializedName("d_s_title")
    private String mDSTitle;
    @SerializedName("d_title")
    private String mDTitle;
    @SerializedName("id")
    private String mId;
    @SerializedName("logo")
    private String mLogo;
    @SerializedName("one_hash")
    private String mOneHash;
    @SerializedName("one_key")
    private String mOneKey;
    @SerializedName("pdbanner")
    private String pdbanner;

    @SerializedName("policy")
    private String policy;
    @SerializedName("about")
    private String about;
    @SerializedName("contact")
    private String contact;
    @SerializedName("terms")
    private String terms;
    @SerializedName("showpre")
    private String showpre;

    @SerializedName("minorder")
    private String minorder;

    @SerializedName("itemlimit")
    private String itemlimit;

    @SerializedName("sgen")
    private String sgen;


    public String getCurrency() {
        return mCurrency;
    }

    public void setCurrency(String currency) {
        mCurrency = currency;
    }

    public String getDSTitle() {
        return mDSTitle;
    }

    public void setDSTitle(String dSTitle) {
        mDSTitle = dSTitle;
    }

    public String getDTitle() {
        return mDTitle;
    }

    public void setDTitle(String dTitle) {
        mDTitle = dTitle;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getLogo() {
        return mLogo;
    }

    public void setLogo(String logo) {
        mLogo = logo;
    }

    public String getOneHash() {
        return mOneHash;
    }

    public void setOneHash(String oneHash) {
        mOneHash = oneHash;
    }

    public String getOneKey() {
        return mOneKey;
    }

    public void setOneKey(String oneKey) {
        mOneKey = oneKey;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getShowpre() {
        return showpre;
    }

    public void setShowpre(String showpre) {
        this.showpre = showpre;
    }

    public String getPdbanner() {
        return pdbanner;
    }

    public void setPdbanner(String pdbanner) {
        this.pdbanner = pdbanner;
    }

    public String getMinorder() {
        return minorder;
    }

    public void setMinorder(String minorder) {
        this.minorder = minorder;
    }

    public String getItemlimit() {
        return itemlimit;
    }

    public void setItemlimit(String itemlimit) {
        this.itemlimit = itemlimit;
    }

    public String getSgen() {
        return sgen;
    }

    public void setSgen(String sgen) {
        this.sgen = sgen;
    }
}
