/*
 *
 * MIT License
 *
 * Copyright (c) 2022 Caputo Ortega, Augusto Franco Bernardo (caputo.com.ar)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * 
*/

package ar.com.caputo.util.languagemapper.component;

/**
 * List of language mappings available following the
 * IETF language tag specification with a slight change
 * where everything is UPPERCASED and the hyphen is
 * replaced by an underscore due to compatibility
 * requirements by the {@code enum} class on Java.
 * 
 * @see <a href="Language Codes">https://datahub.io/core/language-codes</a>
 **/
public enum Language {

    AF, AF_NA, AF_ZA, AGQ, AGQ_CM, AK, AK_GH, AM, AM_ET, AR, AR_001, AR_AE, AR_BH, AR_DJ, AR_DZ, AR_EG, AR_EH, AR_ER,
    AR_IL, AR_IQ, AR_JO, AR_KM, AR_KW, AR_LB, AR_LY, AR_MA, AR_MR, AR_OM, AR_PS, AR_QA, AR_SA, AR_SD, AR_SO, AR_SS,
    AR_SY, AR_TD, AR_TN, AR_YE, AS, AS_IN, ASA, ASA_TZ, AST, AST_ES, AZ, AZ_CYRL, AZ_CYRL_AZ, AZ_LATN, AZ_LATN_AZ, BAS,
    BAS_CM, BE, BE_BY, BEM, BEM_ZM, BEZ, BEZ_TZ, BG, BG_BG, BM, BM_ML, BN, BN_BD, BN_IN, BO, BO_CN, BO_IN, BR, BR_FR,
    BRX, BRX_IN, BS, BS_CYRL, BS_CYRL_BA, BS_LATN, BS_LATN_BA, CA, CA_AD, CA_ES, CA_ES_VALENCIA, CA_FR, CA_IT, CCP,
    CCP_BD, CCP_IN, CE, CE_RU, CEB, CEB_PH, CGG, CGG_UG, CHR, CHR_US, CKB, CKB_IQ, CKB_IR, CS, CS_CZ, CU, CU_RU, CY,
    CY_GB, DA, DA_DK, DA_GL, DAV, DAV_KE, DE, DE_AT, DE_BE, DE_CH, DE_DE, DE_IT, DE_LI, DE_LU, DJE, DJE_NE, DSB, DSB_DE,
    DUA, DUA_CM, DYO, DYO_SN, DZ, DZ_BT, EBU, EBU_KE, EE, EE_GH, EE_TG, EL, EL_CY, EL_GR, EN, EN_001, EN_150, EN_AE,
    EN_AG, EN_AI, EN_AS, EN_AT, EN_AU, EN_BB, EN_BE, EN_BI, EN_BM, EN_BS, EN_BW, EN_BZ, EN_CA, EN_CC, EN_CH, EN_CK,
    EN_CM, EN_CX, EN_CY, EN_DE, EN_DG, EN_DK, EN_DM, EN_ER, EN_FI, EN_FJ, EN_FK, EN_FM, EN_GB, EN_GD, EN_GG, EN_GH,
    EN_GI, EN_GM, EN_GU, EN_GY, EN_HK, EN_IE, EN_IL, EN_IM, EN_IN, EN_IO, EN_JE, EN_JM, EN_KE, EN_KI, EN_KN, EN_KY,
    EN_LC, EN_LR, EN_LS, EN_MG, EN_MH, EN_MO, EN_MP, EN_MS, EN_MT, EN_MU, EN_MW, EN_MY, EN_NA, EN_NF, EN_NG, EN_NL,
    EN_NR, EN_NU, EN_NZ, EN_PG, EN_PH, EN_PK, EN_PN, EN_PR, EN_PW, EN_RW, EN_SB, EN_SC, EN_SD, EN_SE, EN_SG, EN_SH,
    EN_SI, EN_SL, EN_SS, EN_SX, EN_SZ, EN_TC, EN_TK, EN_TO, EN_TT, EN_TV, EN_TZ, EN_UG, EN_UM,

    /** Default language */
    EN_US,

    EN_US_POSIX,
    EN_VC, EN_VG, EN_VI, EN_VU, EN_WS, EN_ZA, EN_ZM, EN_ZW, EO, EO_001, ES, ES_419, ES_AR, ES_BO, ES_BR, ES_BZ, ES_CL,
    ES_CO, ES_CR, ES_CU, ES_DO, ES_EA, ES_EC, ES_ES, ES_GQ, ES_GT, ES_HN, ES_IC, ES_MX, ES_NI, ES_PA, ES_PE, ES_PH,
    ES_PR, ES_PY, ES_SV, ES_US, ES_UY, ES_VE, ET, ET_EE, EU, EU_ES, EWO, EWO_CM, FA, FA_AF, FA_IR, FF, FF_ADLM,
    FF_ADLM_BF, FF_ADLM_CM, FF_ADLM_GH, FF_ADLM_GM, FF_ADLM_GN, FF_ADLM_GW, FF_ADLM_LR, FF_ADLM_MR, FF_ADLM_NE,
    FF_ADLM_NG, FF_ADLM_SL, FF_ADLM_SN, FF_LATN, FF_LATN_BF, FF_LATN_CM, FF_LATN_GH, FF_LATN_GM, FF_LATN_GN, FF_LATN_GW,
    FF_LATN_LR, FF_LATN_MR, FF_LATN_NE, FF_LATN_NG, FF_LATN_SL, FF_LATN_SN, FI, FI_FI, FIL, FIL_PH, FO, FO_DK, FO_FO,
    FR, FR_BE, FR_BF, FR_BI, FR_BJ, FR_BL, FR_CA, FR_CD, FR_CF, FR_CG, FR_CH, FR_CI, FR_CM, FR_DJ, FR_DZ, FR_FR, FR_GA,
    FR_GF, FR_GN, FR_GP, FR_GQ, FR_HT, FR_KM, FR_LU, FR_MA, FR_MC, FR_MF, FR_MG, FR_ML, FR_MQ, FR_MR, FR_MU, FR_NC,
    FR_NE, FR_PF, FR_PM, FR_RE, FR_RW, FR_SC, FR_SN, FR_SY, FR_TD, FR_TG, FR_TN, FR_VU, FR_WF, FR_YT, FUR, FUR_IT, FY,
    FY_NL, GA, GA_GB, GA_IE, GD, GD_GB, GL, GL_ES, GSW, GSW_CH, GSW_FR, GSW_LI, GU, GU_IN, GUZ, GUZ_KE, GV, GV_IM, HA,
    HA_GH, HA_NE, HA_NG, HAW, HAW_US, HE, HE_IL, HI, HI_IN, HR, HR_BA, HR_HR, HSB, HSB_DE, HU, HU_HU, HY, HY_AM, IA,
    IA_001, ID, ID_ID, IG, IG_NG, II, II_CN, IS, IS_IS, IT, IT_CH, IT_IT, IT_SM, IT_VA, JA, JA_JP, JGO, JGO_CM, JMC,
    JMC_TZ, JV, JV_ID, KA, KA_GE, KAB, KAB_DZ, KAM, KAM_KE, KDE, KDE_TZ, KEA, KEA_CV, KHQ, KHQ_ML, KI, KI_KE, KK, KK_KZ,
    KKJ, KKJ_CM, KL, KL_GL, KLN, KLN_KE, KM, KM_KH, KN, KN_IN, KO, KO_KP, KO_KR, KOK, KOK_IN, KS, KS_ARAB, KS_ARAB_IN,
    KSB, KSB_TZ, KSF, KSF_CM, KSH, KSH_DE, KU, KU_TR, KW, KW_GB, KY, KY_KG, LAG, LAG_TZ, LB, LB_LU, LG, LG_UG, LKT,
    LKT_US, LN, LN_AO, LN_CD, LN_CF, LN_CG, LO, LO_LA, LRC, LRC_IQ, LRC_IR, LT, LT_LT, LU, LU_CD, LUO, LUO_KE, LUY,
    LUY_KE, LV, LV_LV, MAI, MAI_IN, MAS, MAS_KE, MAS_TZ, MER, MER_KE, MFE, MFE_MU, MG, MG_MG, MGH, MGH_MZ, MGO, MGO_CM,
    MI, MI_NZ, MK, MK_MK, ML, ML_IN, MN, MN_MN, MNI, MNI_BENG, MNI_BENG_IN, MR, MR_IN, MS, MS_BN, MS_ID, MS_MY, MS_SG,
    MT, MT_MT, MUA, MUA_CM, MY, MY_MM, MZN, MZN_IR, NAQ, NAQ_NA, NB, NB_NO, NB_SJ, ND, ND_ZW, NDS, NDS_DE, NDS_NL, NE,
    NE_IN, NE_NP, NL, NL_AW, NL_BE, NL_BQ, NL_CW, NL_NL, NL_SR, NL_SX, NMG, NMG_CM, NN, NN_NO, NNH, NNH_CM, NUS, NUS_SS,
    NYN, NYN_UG, OM, OM_ET, OM_KE, OR, OR_IN, OS, OS_GE, OS_RU, PA, PA_ARAB, PA_ARAB_PK, PA_GURU, PA_GURU_IN, PCM,
    PCM_NG, PL, PL_PL, PRG, PRG_001, PS, PS_AF, PS_PK, PT, PT_AO, PT_BR, PT_CH, PT_CV, PT_GQ, PT_GW, PT_LU, PT_MO,
    PT_MZ, PT_PT, PT_ST, PT_TL, QU, QU_BO, QU_EC, QU_PE, RM, RM_CH, RN, RN_BI, RO, RO_MD, RO_RO, ROF, ROF_TZ, ROOT, RU,
    RU_BY, RU_KG, RU_KZ, RU_MD, RU_RU, RU_UA, RW, RW_RW, RWK, RWK_TZ, SAH, SAH_RU, SAQ, SAQ_KE, SAT, SAT_OLCK,
    SAT_OLCK_IN, SBP, SBP_TZ, SD, SD_ARAB, SD_ARAB_PK, SD_DEVA, SD_DEVA_IN, SE, SE_FI, SE_NO, SE_SE, SEH, SEH_MZ, SES,
    SES_ML, SG, SG_CF, SHI, SHI_LATN, SHI_LATN_MA, SHI_TFNG, SHI_TFNG_MA, SI, SI_LK, SK, SK_SK, SL, SL_SI, SMN, SMN_FI,
    SN, SN_ZW, SO, SO_DJ, SO_ET, SO_KE, SO_SO, SQ, SQ_AL, SQ_MK, SQ_XK, SR, SR_CYRL, SR_CYRL_BA, SR_CYRL_ME, SR_CYRL_RS,
    SR_CYRL_XK, SR_LATN, SR_LATN_BA, SR_LATN_ME, SR_LATN_RS, SR_LATN_XK, SU, SU_LATN, SU_LATN_ID, SV, SV_AX, SV_FI,
    SV_SE, SW, SW_CD, SW_KE, SW_TZ, SW_UG, TA, TA_IN, TA_LK, TA_MY, TA_SG, TE, TE_IN, TEO, TEO_KE, TEO_UG, TG, TG_TJ,
    TH, TH_TH, TI, TI_ER, TI_ET, TK, TK_TM, TO, TO_TO, TR, TR_CY, TR_TR, TT, TT_RU, TWQ, TWQ_NE, TZM, TZM_MA, UG, UG_CN,
    UK, UK_UA, UR, UR_IN, UR_PK, UZ, UZ_ARAB, UZ_ARAB_AF, UZ_CYRL, UZ_CYRL_UZ, UZ_LATN, UZ_LATN_UZ, VAI, VAI_LATN,
    VAI_LATN_LR, VAI_VAII, VAI_VAII_LR, VI, VI_VN, VO, VO_001, VUN, VUN_TZ, WAE, WAE_CH, WO, WO_SN, XH, XH_ZA, XOG,
    XOG_UG, YAV, YAV_CM, YI, YI_001, YO, YO_BJ, YO_NG, YUE, YUE_HANS, YUE_HANS_CN, YUE_HANT, YUE_HANT_HK, ZGH, ZGH_MA,
    ZH, ZH_HANS, ZH_HANS_CN, ZH_HANS_HK, ZH_HANS_MO, ZH_HANS_SG, ZH_HANT, ZH_HANT_HK, ZH_HANT_MO, ZH_HANT_TW, ZU, ZU_ZA

}
