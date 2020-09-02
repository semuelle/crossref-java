/**
 */
package org.crossref.schema._4._4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mime Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.crossref.schema._4._4._4Package#getMimeTypeType()
 * @model extendedMetaData="name='mime_type_._type'"
 * @generated
 */
public enum MimeTypeType implements Enumerator {
	/**
	 * The '<em><b>Text Css</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_CSS_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_CSS(0, "textCss", "text/css"),

	/**
	 * The '<em><b>Text Csv</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_CSV_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_CSV(1, "textCsv", "text/csv"),

	/**
	 * The '<em><b>Text Enriched</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_ENRICHED_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_ENRICHED(2, "textEnriched", "text/enriched"),

	/**
	 * The '<em><b>Text Html</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_HTML_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_HTML(3, "textHtml", "text/html"),

	/**
	 * The '<em><b>Text Plain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_PLAIN_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_PLAIN(4, "textPlain", "text/plain"),

	/**
	 * The '<em><b>Text Richtext</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_RICHTEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_RICHTEXT(5, "textRichtext", "text/richtext"),

	/**
	 * The '<em><b>Text Rtf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_RTF_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_RTF(6, "textRtf", "text/rtf"),

	/**
	 * The '<em><b>Text Sgml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_SGML_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_SGML(7, "textSgml", "text/sgml"),

	/**
	 * The '<em><b>Text Tab Separated Values</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_TAB_SEPARATED_VALUES_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_TAB_SEPARATED_VALUES(8, "textTabSeparatedValues", "text/tab-separated-values"),

	/**
	 * The '<em><b>Text Xml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_XML_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_XML(9, "textXml", "text/xml"),

	/**
	 * The '<em><b>Text Xml External Parsed Entity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_XML_EXTERNAL_PARSED_ENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_XML_EXTERNAL_PARSED_ENTITY(10, "textXmlExternalParsedEntity", "text/xml-external-parsed-entity"),

	/**
	 * The '<em><b>Multipart Mixed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_MIXED_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPART_MIXED(11, "multipartMixed", "multipart/mixed"),

	/**
	 * The '<em><b>Multipart Alternative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_ALTERNATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPART_ALTERNATIVE(12, "multipartAlternative", "multipart/alternative"),

	/**
	 * The '<em><b>Multipart Digest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_DIGEST_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPART_DIGEST(13, "multipartDigest", "multipart/digest"),

	/**
	 * The '<em><b>Multipart Parallel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_PARALLEL_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPART_PARALLEL(14, "multipartParallel", "multipart/parallel"),

	/**
	 * The '<em><b>Multipart Appledouble</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_APPLEDOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPART_APPLEDOUBLE(15, "multipartAppledouble", "multipart/appledouble"),

	/**
	 * The '<em><b>Multipart Header Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_HEADER_SET_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPART_HEADER_SET(16, "multipartHeaderSet", "multipart/header-set"),

	/**
	 * The '<em><b>Multipart Form Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_FORM_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPART_FORM_DATA(17, "multipartFormData", "multipart/form-data"),

	/**
	 * The '<em><b>Multipart Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPART_REPORT(18, "multipartReport", "multipart/report"),

	/**
	 * The '<em><b>Multipart Voice Message</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_VOICE_MESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPART_VOICE_MESSAGE(19, "multipartVoiceMessage", "multipart/voice-message"),

	/**
	 * The '<em><b>Multipart Signed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_SIGNED_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPART_SIGNED(20, "multipartSigned", "multipart/signed"),

	/**
	 * The '<em><b>Multipart Encrypted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_ENCRYPTED_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPART_ENCRYPTED(21, "multipartEncrypted", "multipart/encrypted"),

	/**
	 * The '<em><b>Multipart Byteranges</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_BYTERANGES_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPART_BYTERANGES(22, "multipartByteranges", "multipart/byteranges"),

	/**
	 * The '<em><b>Application Eps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_EPS_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_EPS(23, "applicationEps", "application/eps"),

	/**
	 * The '<em><b>Application Epub Zip</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_EPUB_ZIP_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_EPUB_ZIP(24, "applicationEpubZip", "application/epub+zip"),

	/**
	 * The '<em><b>Application Octet Stream</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_OCTET_STREAM_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_OCTET_STREAM(25, "applicationOctetStream", "application/octet-stream"),

	/**
	 * The '<em><b>Application Postscript</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_POSTSCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_POSTSCRIPT(26, "applicationPostscript", "application/postscript"),

	/**
	 * The '<em><b>Application Rtf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_RTF_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_RTF(27, "applicationRtf", "application/rtf"),

	/**
	 * The '<em><b>Application Applefile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_APPLEFILE_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_APPLEFILE(28, "applicationApplefile", "application/applefile"),

	/**
	 * The '<em><b>Application Mac Binhex40</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_MAC_BINHEX40_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_MAC_BINHEX40(29, "applicationMacBinhex40", "application/mac-binhex40"),

	/**
	 * The '<em><b>Application Wordperfect51</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_WORDPERFECT51_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_WORDPERFECT51(30, "applicationWordperfect51", "application/wordperfect5.1"),

	/**
	 * The '<em><b>Application Pdf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_PDF_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_PDF(31, "applicationPdf", "application/pdf"),

	/**
	 * The '<em><b>Application XGzip</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_XGZIP_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_XGZIP(32, "applicationXGzip", "application/x-gzip"),

	/**
	 * The '<em><b>Application Zip</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_ZIP_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_ZIP(33, "applicationZip", "application/zip"),

	/**
	 * The '<em><b>Application Gzip</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_GZIP_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_GZIP(34, "applicationGzip", "application/gzip"),

	/**
	 * The '<em><b>Application Macwriteii</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_MACWRITEII_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_MACWRITEII(35, "applicationMacwriteii", "application/macwriteii"),

	/**
	 * The '<em><b>Application Msword</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_MSWORD_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_MSWORD(36, "applicationMsword", "application/msword"),

	/**
	 * The '<em><b>Application Sgml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_SGML_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_SGML(37, "applicationSgml", "application/sgml"),

	/**
	 * The '<em><b>Application Cals1840</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_CALS1840_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_CALS1840(38, "applicationCals1840", "application/cals-1840"),

	/**
	 * The '<em><b>Application Pgp Encrypted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_PGP_ENCRYPTED_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_PGP_ENCRYPTED(39, "applicationPgpEncrypted", "application/pgp-encrypted"),

	/**
	 * The '<em><b>Application Pgp Signature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_PGP_SIGNATURE_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_PGP_SIGNATURE(40, "applicationPgpSignature", "application/pgp-signature"),

	/**
	 * The '<em><b>Application Pgp Keys</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_PGP_KEYS_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_PGP_KEYS(41, "applicationPgpKeys", "application/pgp-keys"),

	/**
	 * The '<em><b>Application Sgml Open Catalog</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_SGML_OPEN_CATALOG_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_SGML_OPEN_CATALOG(42, "applicationSgmlOpenCatalog", "application/sgml-open-catalog"),

	/**
	 * The '<em><b>Application Rc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_RC_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_RC(43, "applicationRc", "application/rc"),

	/**
	 * The '<em><b>Application Xml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_XML_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_XML(44, "applicationXml", "application/xml"),

	/**
	 * The '<em><b>Application Xml External Parsed Entity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_XML_EXTERNAL_PARSED_ENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_XML_EXTERNAL_PARSED_ENTITY(45, "applicationXmlExternalParsedEntity", "application/xml-external-parsed-entity"),

	/**
	 * The '<em><b>Application Xml Dtd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_XML_DTD_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_XML_DTD(46, "applicationXmlDtd", "application/xml-dtd"),

	/**
	 * The '<em><b>Application Batch SMTP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_BATCH_SMTP_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_BATCH_SMTP(47, "applicationBatchSMTP", "application/batch-SMTP"),

	/**
	 * The '<em><b>Application Ipp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_IPP_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_IPP(48, "applicationIpp", "application/ipp"),

	/**
	 * The '<em><b>Application Ocsp Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_OCSP_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_OCSP_REQUEST(49, "applicationOcspRequest", "application/ocsp-request"),

	/**
	 * The '<em><b>Application Ocsp Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_OCSP_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_OCSP_RESPONSE(50, "applicationOcspResponse", "application/ocsp-response"),

	/**
	 * The '<em><b>Application Vnd Wolfram Mathematica</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VND_WOLFRAM_MATHEMATICA_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_VND_WOLFRAM_MATHEMATICA(51, "applicationVndWolframMathematica", "application/vnd.wolfram.mathematica"),

	/**
	 * The '<em><b>Application Vnd Wolfram Mathematica Package</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VND_WOLFRAM_MATHEMATICA_PACKAGE_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_VND_WOLFRAM_MATHEMATICA_PACKAGE(52, "applicationVndWolframMathematicaPackage", "application/vnd.wolfram.mathematica.package"),

	/**
	 * The '<em><b>Application Vnd Wolfram Player</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VND_WOLFRAM_PLAYER_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_VND_WOLFRAM_PLAYER(53, "applicationVndWolframPlayer", "application/vnd.wolfram.player"),

	/**
	 * The '<em><b>Application Vnd Oasis Opendocument Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT(54, "applicationVndOasisOpendocumentText", "application/vnd.oasis.opendocument.text"),

	/**
	 * The '<em><b>Application Vnd Oasis Opendocument Presentation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VND_OASIS_OPENDOCUMENT_PRESENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_VND_OASIS_OPENDOCUMENT_PRESENTATION(55, "applicationVndOasisOpendocumentPresentation", "application/vnd.oasis.opendocument.presentation"),

	/**
	 * The '<em><b>Application Vnd Oasis Opendocument Spreadsheet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VND_OASIS_OPENDOCUMENT_SPREADSHEET_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_VND_OASIS_OPENDOCUMENT_SPREADSHEET(56, "applicationVndOasisOpendocumentSpreadsheet", "application/vnd.oasis.opendocument.spreadsheet"),

	/**
	 * The '<em><b>Application Vnd Ms Asf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VND_MS_ASF_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_VND_MS_ASF(57, "applicationVndMsAsf", "application/vnd.ms-asf"),

	/**
	 * The '<em><b>Application Vnd Ms Excel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VND_MS_EXCEL_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_VND_MS_EXCEL(58, "applicationVndMsExcel", "application/vnd.ms-excel"),

	/**
	 * The '<em><b>Application Vnd Ms Powerpoint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VND_MS_POWERPOINT_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_VND_MS_POWERPOINT(59, "applicationVndMsPowerpoint", "application/vnd.ms-powerpoint"),

	/**
	 * The '<em><b>Application Vnd Openxmlformats Officedocument Presentationml Presentation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_PRESENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_PRESENTATION(60, "applicationVndOpenxmlformatsOfficedocumentPresentationmlPresentation", "application/vnd.openxmlformats-officedocument.presentationml.presentation"),

	/**
	 * The '<em><b>Application Vnd Openxmlformats Officedocument Spreadsheetml Sheet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEET_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEET(61, "applicationVndOpenxmlformatsOfficedocumentSpreadsheetmlSheet", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"),

	/**
	 * The '<em><b>Application Vnd Openxmlformats Officedocument Wordprocessingml Document</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT(62, "applicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument", "application/vnd.openxmlformats-officedocument.wordprocessingml.document"),

	/**
	 * The '<em><b>Application Regex Clinical Trial Number</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_REGEX_CLINICAL_TRIAL_NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_REGEX_CLINICAL_TRIAL_NUMBER(64, "applicationRegexClinicalTrialNumber", "application/regex.clinical-trial-number"),

	/**
	 * The '<em><b>Image Fits</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_FITS_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_FITS(65, "imageFits", "image/fits"),

	/**
	 * The '<em><b>Image Jpeg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_JPEG_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_JPEG(66, "imageJpeg", "image/jpeg"),

	/**
	 * The '<em><b>Image Gif</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_GIF_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_GIF(67, "imageGif", "image/gif"),

	/**
	 * The '<em><b>Image Ief</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_IEF_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_IEF(68, "imageIef", "image/ief"),

	/**
	 * The '<em><b>Image G3fax</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_G3FAX_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_G3FAX(69, "imageG3fax", "image/g3fax"),

	/**
	 * The '<em><b>Image Tiff</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_TIFF_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_TIFF(70, "imageTiff", "image/tiff"),

	/**
	 * The '<em><b>Image Graphics Metafile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_GRAPHICS_METAFILE_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_GRAPHICS_METAFILE(71, "imageGraphicsMetafile", "image/Graphics-Metafile"),

	/**
	 * The '<em><b>Image Png</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_PNG_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_PNG(72, "imagePng", "image/png"),

	/**
	 * The '<em><b>Audio Basic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO_BASIC_VALUE
	 * @generated
	 * @ordered
	 */
	AUDIO_BASIC(73, "audioBasic", "audio/basic"),

	/**
	 * The '<em><b>Audio32kadpcm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO32KADPCM_VALUE
	 * @generated
	 * @ordered
	 */
	AUDIO32KADPCM(74, "audio32kadpcm", "audio/32kadpcm"),

	/**
	 * The '<em><b>Audio Mpeg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO_MPEG_VALUE
	 * @generated
	 * @ordered
	 */
	AUDIO_MPEG(75, "audioMpeg", "audio/mpeg"),

	/**
	 * The '<em><b>Audio Parityfec</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO_PARITYFEC_VALUE
	 * @generated
	 * @ordered
	 */
	AUDIO_PARITYFEC(76, "audioParityfec", "audio/parityfec"),

	/**
	 * The '<em><b>Audio MP4ALATM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO_MP4ALATM_VALUE
	 * @generated
	 * @ordered
	 */
	AUDIO_MP4ALATM(77, "audioMP4ALATM", "audio/MP4A-LATM"),

	/**
	 * The '<em><b>Audio Mpa Robust</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO_MPA_ROBUST_VALUE
	 * @generated
	 * @ordered
	 */
	AUDIO_MPA_ROBUST(78, "audioMpaRobust", "audio/mpa-robust"),

	/**
	 * The '<em><b>Video XMs Wmv</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_XMS_WMV_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO_XMS_WMV(79, "videoXMsWmv", "video/x-ms-wmv"),

	/**
	 * The '<em><b>Video Avi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_AVI_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO_AVI(80, "videoAvi", "video/avi"),

	/**
	 * The '<em><b>Video Mpeg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_MPEG_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO_MPEG(81, "videoMpeg", "video/mpeg"),

	/**
	 * The '<em><b>Video Quicktime</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_QUICKTIME_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO_QUICKTIME(82, "videoQuicktime", "video/quicktime"),

	/**
	 * The '<em><b>Video Pointer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_POINTER_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO_POINTER(83, "videoPointer", "video/pointer"),

	/**
	 * The '<em><b>Video Parityfec</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_PARITYFEC_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO_PARITYFEC(84, "videoParityfec", "video/parityfec"),

	/**
	 * The '<em><b>Video MP4VES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_MP4VES_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO_MP4VES(85, "videoMP4VES", "video/MP4V-ES"),

	/**
	 * The '<em><b>Video Mp4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_MP4_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO_MP4(86, "videoMp4", "video/mp4"),

	/**
	 * The '<em><b>Chemical XAlchemy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XALCHEMY_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XALCHEMY(87, "chemicalXAlchemy", "chemical/x-alchemy"),

	/**
	 * The '<em><b>Chemical XCache Csf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCACHE_CSF_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XCACHE_CSF(88, "chemicalXCacheCsf", "chemical/x-cache-csf"),

	/**
	 * The '<em><b>Chemical XCactvs Binary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCACTVS_BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XCACTVS_BINARY(89, "chemicalXCactvsBinary", "chemical/x-cactvs-binary"),

	/**
	 * The '<em><b>Chemical XCdx</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCDX_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XCDX(92, "chemicalXCdx", "chemical/x-cdx"),

	/**
	 * The '<em><b>Chemical XCerius</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCERIUS_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XCERIUS(93, "chemicalXCerius", "chemical/x-cerius"),

	/**
	 * The '<em><b>Chemical XChemdraw</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCHEMDRAW_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XCHEMDRAW(94, "chemicalXChemdraw", "chemical/x-chemdraw"),

	/**
	 * The '<em><b>Chemical XCif</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCIF_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XCIF(95, "chemicalXCif", "chemical/x-cif"),

	/**
	 * The '<em><b>Chemical XMmcif</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XMMCIF_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XMMCIF(96, "chemicalXMmcif", "chemical/x-mmcif"),

	/**
	 * The '<em><b>Chemical XChem3d</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCHEM3D_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XCHEM3D(97, "chemicalXChem3d", "chemical/x-chem3d"),

	/**
	 * The '<em><b>Chemical XCmdf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCMDF_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XCMDF(98, "chemicalXCmdf", "chemical/x-cmdf"),

	/**
	 * The '<em><b>Chemical XCompass</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCOMPASS_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XCOMPASS(99, "chemicalXCompass", "chemical/x-compass"),

	/**
	 * The '<em><b>Chemical XCrossfire</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCROSSFIRE_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XCROSSFIRE(100, "chemicalXCrossfire", "chemical/x-crossfire"),

	/**
	 * The '<em><b>Chemical XCml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCML_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XCML(101, "chemicalXCml", "chemical/x-cml"),

	/**
	 * The '<em><b>Chemical XCsml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCSML_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XCSML(102, "chemicalXCsml", "chemical/x-csml"),

	/**
	 * The '<em><b>Chemical XCtx</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCTX_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XCTX(103, "chemicalXCtx", "chemical/x-ctx"),

	/**
	 * The '<em><b>Chemical XCxf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCXF_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XCXF(104, "chemicalXCxf", "chemical/x-cxf"),

	/**
	 * The '<em><b>Chemical XDaylight Smiles</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XDAYLIGHT_SMILES_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XDAYLIGHT_SMILES(105, "chemicalXDaylightSmiles", "chemical/x-daylight-smiles"),

	/**
	 * The '<em><b>Chemical XEmbl Dl Nucleotide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XEMBL_DL_NUCLEOTIDE_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XEMBL_DL_NUCLEOTIDE(106, "chemicalXEmblDlNucleotide", "chemical/x-embl-dl-nucleotide"),

	/**
	 * The '<em><b>Chemical XGalactic Spc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XGALACTIC_SPC_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XGALACTIC_SPC(107, "chemicalXGalacticSpc", "chemical/x-galactic-spc"),

	/**
	 * The '<em><b>Chemical XGamess Input</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XGAMESS_INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XGAMESS_INPUT(108, "chemicalXGamessInput", "chemical/x-gamess-input"),

	/**
	 * The '<em><b>Chemical XGaussian Input</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XGAUSSIAN_INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XGAUSSIAN_INPUT(109, "chemicalXGaussianInput", "chemical/x-gaussian-input"),

	/**
	 * The '<em><b>Chemical XGaussian Checkpoint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XGAUSSIAN_CHECKPOINT_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XGAUSSIAN_CHECKPOINT(110, "chemicalXGaussianCheckpoint", "chemical/x-gaussian-checkpoint"),

	/**
	 * The '<em><b>Chemical XGaussian Cube</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XGAUSSIAN_CUBE_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XGAUSSIAN_CUBE(111, "chemicalXGaussianCube", "chemical/x-gaussian-cube"),

	/**
	 * The '<em><b>Chemical XGcg8 Sequence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XGCG8_SEQUENCE_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XGCG8_SEQUENCE(112, "chemicalXGcg8Sequence", "chemical/x-gcg8-sequence"),

	/**
	 * The '<em><b>Chemical XGenbank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XGENBANK_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XGENBANK(113, "chemicalXGenbank", "chemical/x-genbank"),

	/**
	 * The '<em><b>Chemical XIsostar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XISOSTAR_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XISOSTAR(114, "chemicalXIsostar", "chemical/x-isostar"),

	/**
	 * The '<em><b>Chemical XJcamp Dx</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XJCAMP_DX_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XJCAMP_DX(115, "chemicalXJcampDx", "chemical/x-jcamp-dx"),

	/**
	 * The '<em><b>Chemical XKinemage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XKINEMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XKINEMAGE(116, "chemicalXKinemage", "chemical/x-kinemage"),

	/**
	 * The '<em><b>Chemical XMacmolecule</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XMACMOLECULE_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XMACMOLECULE(117, "chemicalXMacmolecule", "chemical/x-macmolecule"),

	/**
	 * The '<em><b>Chemical XMacromodel Input</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XMACROMODEL_INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XMACROMODEL_INPUT(118, "chemicalXMacromodelInput", "chemical/x-macromodel-input"),

	/**
	 * The '<em><b>Chemical XMdl Molfile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XMDL_MOLFILE_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XMDL_MOLFILE(119, "chemicalXMdlMolfile", "chemical/x-mdl-molfile"),

	/**
	 * The '<em><b>Chemical XMdl Rdfile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XMDL_RDFILE_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XMDL_RDFILE(120, "chemicalXMdlRdfile", "chemical/x-mdl-rdfile"),

	/**
	 * The '<em><b>Chemical XMdl Rxnfile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XMDL_RXNFILE_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XMDL_RXNFILE(121, "chemicalXMdlRxnfile", "chemical/x-mdl-rxnfile"),

	/**
	 * The '<em><b>Chemical XMdl Sdfile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XMDL_SDFILE_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XMDL_SDFILE(122, "chemicalXMdlSdfile", "chemical/x-mdl-sdfile"),

	/**
	 * The '<em><b>Chemical XMdl Tgf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XMDL_TGF_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XMDL_TGF(123, "chemicalXMdlTgf", "chemical/x-mdl-tgf"),

	/**
	 * The '<em><b>Chemical XMif</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XMIF_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XMIF(124, "chemicalXMif", "chemical/x-mif"),

	/**
	 * The '<em><b>Chemical XMol2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XMOL2_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XMOL2(125, "chemicalXMol2", "chemical/x-mol2"),

	/**
	 * The '<em><b>Chemical XMolconn Z</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XMOLCONN_Z_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XMOLCONN_Z(126, "chemicalXMolconnZ", "chemical/x-molconn-Z"),

	/**
	 * The '<em><b>Chemical XMopac Input</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XMOPAC_INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XMOPAC_INPUT(127, "chemicalXMopacInput", "chemical/x-mopac-input"),

	/**
	 * The '<em><b>Chemical XMopac Graph</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XMOPAC_GRAPH_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XMOPAC_GRAPH(128, "chemicalXMopacGraph", "chemical/x-mopac-graph"),

	/**
	 * The '<em><b>Chemical XNcbi Asn1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XNCBI_ASN1_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XNCBI_ASN1(129, "chemicalXNcbiAsn1", "chemical/x-ncbi-asn1"),

	/**
	 * The '<em><b>Chemical XNcbi Asn1 Binary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XNCBI_ASN1_BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XNCBI_ASN1_BINARY(130, "chemicalXNcbiAsn1Binary", "chemical/x-ncbi-asn1-binary"),

	/**
	 * The '<em><b>Chemical XPdb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XPDB_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XPDB(131, "chemicalXPdb", "chemical/x-pdb"),

	/**
	 * The '<em><b>Chemical XSwissprot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XSWISSPROT_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XSWISSPROT(132, "chemicalXSwissprot", "chemical/x-swissprot"),

	/**
	 * The '<em><b>Chemical XVamas Iso14976</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XVAMAS_ISO14976_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XVAMAS_ISO14976(133, "chemicalXVamasIso14976", "chemical/x-vamas-iso14976"),

	/**
	 * The '<em><b>Chemical XVmd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XVMD_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XVMD(134, "chemicalXVmd", "chemical/x-vmd"),

	/**
	 * The '<em><b>Chemical XXtel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XXTEL_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XXTEL(135, "chemicalXXtel", "chemical/x-xtel"),

	/**
	 * The '<em><b>Chemical XXyz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XXYZ_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_XXYZ(136, "chemicalXXyz", "chemical/x-xyz"),

	/**
	 * The '<em><b>Model Stl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODEL_STL_VALUE
	 * @generated
	 * @ordered
	 */
	MODEL_STL(137, "modelStl", "model/stl"),

	/**
	 * The '<em><b>Model XStl Binary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODEL_XSTL_BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	MODEL_XSTL_BINARY(138, "modelXStlBinary", "model/x.stl-binary"),

	/**
	 * The '<em><b>Model XStl Ascii</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODEL_XSTL_ASCII_VALUE
	 * @generated
	 * @ordered
	 */
	MODEL_XSTL_ASCII(139, "modelXStlAscii", "model/x.stl-ascii"),

	/**
	 * The '<em><b>Model Vrml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODEL_VRML_VALUE
	 * @generated
	 * @ordered
	 */
	MODEL_VRML(140, "modelVrml", "model/vrml"),

	/**
	 * The '<em><b>Audio XWav</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO_XWAV_VALUE
	 * @generated
	 * @ordered
	 */
	AUDIO_XWAV(141, "audioXWav", "audio/x-wav"),

	/**
	 * The '<em><b>Video XFlv</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_XFLV_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO_XFLV(142, "videoXFlv", "video/x-flv"),

	/**
	 * The '<em><b>Data Spcvue Htm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_SPCVUE_HTM_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_SPCVUE_HTM(143, "DataSpcvueHtm", "Data/spcvue.htm");

	/**
	 * The '<em><b>Text Css</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_CSS
	 * @model name="textCss" literal="text/css"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_CSS_VALUE = 0;

	/**
	 * The '<em><b>Text Csv</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_CSV
	 * @model name="textCsv" literal="text/csv"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_CSV_VALUE = 1;

	/**
	 * The '<em><b>Text Enriched</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_ENRICHED
	 * @model name="textEnriched" literal="text/enriched"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_ENRICHED_VALUE = 2;

	/**
	 * The '<em><b>Text Html</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_HTML
	 * @model name="textHtml" literal="text/html"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_HTML_VALUE = 3;

	/**
	 * The '<em><b>Text Plain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_PLAIN
	 * @model name="textPlain" literal="text/plain"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_PLAIN_VALUE = 4;

	/**
	 * The '<em><b>Text Richtext</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_RICHTEXT
	 * @model name="textRichtext" literal="text/richtext"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_RICHTEXT_VALUE = 5;

	/**
	 * The '<em><b>Text Rtf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_RTF
	 * @model name="textRtf" literal="text/rtf"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_RTF_VALUE = 6;

	/**
	 * The '<em><b>Text Sgml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_SGML
	 * @model name="textSgml" literal="text/sgml"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_SGML_VALUE = 7;

	/**
	 * The '<em><b>Text Tab Separated Values</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_TAB_SEPARATED_VALUES
	 * @model name="textTabSeparatedValues" literal="text/tab-separated-values"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_TAB_SEPARATED_VALUES_VALUE = 8;

	/**
	 * The '<em><b>Text Xml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_XML
	 * @model name="textXml" literal="text/xml"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_XML_VALUE = 9;

	/**
	 * The '<em><b>Text Xml External Parsed Entity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_XML_EXTERNAL_PARSED_ENTITY
	 * @model name="textXmlExternalParsedEntity" literal="text/xml-external-parsed-entity"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_XML_EXTERNAL_PARSED_ENTITY_VALUE = 10;

	/**
	 * The '<em><b>Multipart Mixed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_MIXED
	 * @model name="multipartMixed" literal="multipart/mixed"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPART_MIXED_VALUE = 11;

	/**
	 * The '<em><b>Multipart Alternative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_ALTERNATIVE
	 * @model name="multipartAlternative" literal="multipart/alternative"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPART_ALTERNATIVE_VALUE = 12;

	/**
	 * The '<em><b>Multipart Digest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_DIGEST
	 * @model name="multipartDigest" literal="multipart/digest"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPART_DIGEST_VALUE = 13;

	/**
	 * The '<em><b>Multipart Parallel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_PARALLEL
	 * @model name="multipartParallel" literal="multipart/parallel"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPART_PARALLEL_VALUE = 14;

	/**
	 * The '<em><b>Multipart Appledouble</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_APPLEDOUBLE
	 * @model name="multipartAppledouble" literal="multipart/appledouble"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPART_APPLEDOUBLE_VALUE = 15;

	/**
	 * The '<em><b>Multipart Header Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_HEADER_SET
	 * @model name="multipartHeaderSet" literal="multipart/header-set"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPART_HEADER_SET_VALUE = 16;

	/**
	 * The '<em><b>Multipart Form Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_FORM_DATA
	 * @model name="multipartFormData" literal="multipart/form-data"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPART_FORM_DATA_VALUE = 17;

	/**
	 * The '<em><b>Multipart Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_REPORT
	 * @model name="multipartReport" literal="multipart/report"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPART_REPORT_VALUE = 18;

	/**
	 * The '<em><b>Multipart Voice Message</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_VOICE_MESSAGE
	 * @model name="multipartVoiceMessage" literal="multipart/voice-message"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPART_VOICE_MESSAGE_VALUE = 19;

	/**
	 * The '<em><b>Multipart Signed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_SIGNED
	 * @model name="multipartSigned" literal="multipart/signed"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPART_SIGNED_VALUE = 20;

	/**
	 * The '<em><b>Multipart Encrypted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_ENCRYPTED
	 * @model name="multipartEncrypted" literal="multipart/encrypted"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPART_ENCRYPTED_VALUE = 21;

	/**
	 * The '<em><b>Multipart Byteranges</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_BYTERANGES
	 * @model name="multipartByteranges" literal="multipart/byteranges"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPART_BYTERANGES_VALUE = 22;

	/**
	 * The '<em><b>Application Eps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_EPS
	 * @model name="applicationEps" literal="application/eps"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_EPS_VALUE = 23;

	/**
	 * The '<em><b>Application Epub Zip</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_EPUB_ZIP
	 * @model name="applicationEpubZip" literal="application/epub+zip"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_EPUB_ZIP_VALUE = 24;

	/**
	 * The '<em><b>Application Octet Stream</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_OCTET_STREAM
	 * @model name="applicationOctetStream" literal="application/octet-stream"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_OCTET_STREAM_VALUE = 25;

	/**
	 * The '<em><b>Application Postscript</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_POSTSCRIPT
	 * @model name="applicationPostscript" literal="application/postscript"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_POSTSCRIPT_VALUE = 26;

	/**
	 * The '<em><b>Application Rtf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_RTF
	 * @model name="applicationRtf" literal="application/rtf"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_RTF_VALUE = 27;

	/**
	 * The '<em><b>Application Applefile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_APPLEFILE
	 * @model name="applicationApplefile" literal="application/applefile"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_APPLEFILE_VALUE = 28;

	/**
	 * The '<em><b>Application Mac Binhex40</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_MAC_BINHEX40
	 * @model name="applicationMacBinhex40" literal="application/mac-binhex40"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_MAC_BINHEX40_VALUE = 29;

	/**
	 * The '<em><b>Application Wordperfect51</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_WORDPERFECT51
	 * @model name="applicationWordperfect51" literal="application/wordperfect5.1"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_WORDPERFECT51_VALUE = 30;

	/**
	 * The '<em><b>Application Pdf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_PDF
	 * @model name="applicationPdf" literal="application/pdf"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_PDF_VALUE = 31;

	/**
	 * The '<em><b>Application XGzip</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_XGZIP
	 * @model name="applicationXGzip" literal="application/x-gzip"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_XGZIP_VALUE = 32;

	/**
	 * The '<em><b>Application Zip</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_ZIP
	 * @model name="applicationZip" literal="application/zip"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_ZIP_VALUE = 33;

	/**
	 * The '<em><b>Application Gzip</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_GZIP
	 * @model name="applicationGzip" literal="application/gzip"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_GZIP_VALUE = 34;

	/**
	 * The '<em><b>Application Macwriteii</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_MACWRITEII
	 * @model name="applicationMacwriteii" literal="application/macwriteii"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_MACWRITEII_VALUE = 35;

	/**
	 * The '<em><b>Application Msword</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_MSWORD
	 * @model name="applicationMsword" literal="application/msword"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_MSWORD_VALUE = 36;

	/**
	 * The '<em><b>Application Sgml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_SGML
	 * @model name="applicationSgml" literal="application/sgml"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_SGML_VALUE = 37;

	/**
	 * The '<em><b>Application Cals1840</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_CALS1840
	 * @model name="applicationCals1840" literal="application/cals-1840"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_CALS1840_VALUE = 38;

	/**
	 * The '<em><b>Application Pgp Encrypted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_PGP_ENCRYPTED
	 * @model name="applicationPgpEncrypted" literal="application/pgp-encrypted"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_PGP_ENCRYPTED_VALUE = 39;

	/**
	 * The '<em><b>Application Pgp Signature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_PGP_SIGNATURE
	 * @model name="applicationPgpSignature" literal="application/pgp-signature"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_PGP_SIGNATURE_VALUE = 40;

	/**
	 * The '<em><b>Application Pgp Keys</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_PGP_KEYS
	 * @model name="applicationPgpKeys" literal="application/pgp-keys"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_PGP_KEYS_VALUE = 41;

	/**
	 * The '<em><b>Application Sgml Open Catalog</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_SGML_OPEN_CATALOG
	 * @model name="applicationSgmlOpenCatalog" literal="application/sgml-open-catalog"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_SGML_OPEN_CATALOG_VALUE = 42;

	/**
	 * The '<em><b>Application Rc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_RC
	 * @model name="applicationRc" literal="application/rc"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_RC_VALUE = 43;

	/**
	 * The '<em><b>Application Xml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_XML
	 * @model name="applicationXml" literal="application/xml"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_XML_VALUE = 44;

	/**
	 * The '<em><b>Application Xml External Parsed Entity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_XML_EXTERNAL_PARSED_ENTITY
	 * @model name="applicationXmlExternalParsedEntity" literal="application/xml-external-parsed-entity"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_XML_EXTERNAL_PARSED_ENTITY_VALUE = 45;

	/**
	 * The '<em><b>Application Xml Dtd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_XML_DTD
	 * @model name="applicationXmlDtd" literal="application/xml-dtd"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_XML_DTD_VALUE = 46;

	/**
	 * The '<em><b>Application Batch SMTP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_BATCH_SMTP
	 * @model name="applicationBatchSMTP" literal="application/batch-SMTP"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_BATCH_SMTP_VALUE = 47;

	/**
	 * The '<em><b>Application Ipp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_IPP
	 * @model name="applicationIpp" literal="application/ipp"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_IPP_VALUE = 48;

	/**
	 * The '<em><b>Application Ocsp Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_OCSP_REQUEST
	 * @model name="applicationOcspRequest" literal="application/ocsp-request"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_OCSP_REQUEST_VALUE = 49;

	/**
	 * The '<em><b>Application Ocsp Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_OCSP_RESPONSE
	 * @model name="applicationOcspResponse" literal="application/ocsp-response"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_OCSP_RESPONSE_VALUE = 50;

	/**
	 * The '<em><b>Application Vnd Wolfram Mathematica</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VND_WOLFRAM_MATHEMATICA
	 * @model name="applicationVndWolframMathematica" literal="application/vnd.wolfram.mathematica"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_VND_WOLFRAM_MATHEMATICA_VALUE = 51;

	/**
	 * The '<em><b>Application Vnd Wolfram Mathematica Package</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VND_WOLFRAM_MATHEMATICA_PACKAGE
	 * @model name="applicationVndWolframMathematicaPackage" literal="application/vnd.wolfram.mathematica.package"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_VND_WOLFRAM_MATHEMATICA_PACKAGE_VALUE = 52;

	/**
	 * The '<em><b>Application Vnd Wolfram Player</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VND_WOLFRAM_PLAYER
	 * @model name="applicationVndWolframPlayer" literal="application/vnd.wolfram.player"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_VND_WOLFRAM_PLAYER_VALUE = 53;

	/**
	 * The '<em><b>Application Vnd Oasis Opendocument Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT
	 * @model name="applicationVndOasisOpendocumentText" literal="application/vnd.oasis.opendocument.text"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT_VALUE = 54;

	/**
	 * The '<em><b>Application Vnd Oasis Opendocument Presentation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VND_OASIS_OPENDOCUMENT_PRESENTATION
	 * @model name="applicationVndOasisOpendocumentPresentation" literal="application/vnd.oasis.opendocument.presentation"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_VND_OASIS_OPENDOCUMENT_PRESENTATION_VALUE = 55;

	/**
	 * The '<em><b>Application Vnd Oasis Opendocument Spreadsheet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VND_OASIS_OPENDOCUMENT_SPREADSHEET
	 * @model name="applicationVndOasisOpendocumentSpreadsheet" literal="application/vnd.oasis.opendocument.spreadsheet"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_VND_OASIS_OPENDOCUMENT_SPREADSHEET_VALUE = 56;

	/**
	 * The '<em><b>Application Vnd Ms Asf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VND_MS_ASF
	 * @model name="applicationVndMsAsf" literal="application/vnd.ms-asf"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_VND_MS_ASF_VALUE = 57;

	/**
	 * The '<em><b>Application Vnd Ms Excel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VND_MS_EXCEL
	 * @model name="applicationVndMsExcel" literal="application/vnd.ms-excel"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_VND_MS_EXCEL_VALUE = 58;

	/**
	 * The '<em><b>Application Vnd Ms Powerpoint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VND_MS_POWERPOINT
	 * @model name="applicationVndMsPowerpoint" literal="application/vnd.ms-powerpoint"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_VND_MS_POWERPOINT_VALUE = 59;

	/**
	 * The '<em><b>Application Vnd Openxmlformats Officedocument Presentationml Presentation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_PRESENTATION
	 * @model name="applicationVndOpenxmlformatsOfficedocumentPresentationmlPresentation" literal="application/vnd.openxmlformats-officedocument.presentationml.presentation"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_PRESENTATION_VALUE = 60;

	/**
	 * The '<em><b>Application Vnd Openxmlformats Officedocument Spreadsheetml Sheet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEET
	 * @model name="applicationVndOpenxmlformatsOfficedocumentSpreadsheetmlSheet" literal="application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEET_VALUE = 61;

	/**
	 * The '<em><b>Application Vnd Openxmlformats Officedocument Wordprocessingml Document</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT
	 * @model name="applicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument" literal="application/vnd.openxmlformats-officedocument.wordprocessingml.document"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT_VALUE = 62;

	/**
	 * The '<em><b>Application Regex Clinical Trial Number</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_REGEX_CLINICAL_TRIAL_NUMBER
	 * @model name="applicationRegexClinicalTrialNumber" literal="application/regex.clinical-trial-number"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_REGEX_CLINICAL_TRIAL_NUMBER_VALUE = 64;

	/**
	 * The '<em><b>Image Fits</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_FITS
	 * @model name="imageFits" literal="image/fits"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_FITS_VALUE = 65;

	/**
	 * The '<em><b>Image Jpeg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_JPEG
	 * @model name="imageJpeg" literal="image/jpeg"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_JPEG_VALUE = 66;

	/**
	 * The '<em><b>Image Gif</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_GIF
	 * @model name="imageGif" literal="image/gif"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_GIF_VALUE = 67;

	/**
	 * The '<em><b>Image Ief</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_IEF
	 * @model name="imageIef" literal="image/ief"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_IEF_VALUE = 68;

	/**
	 * The '<em><b>Image G3fax</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_G3FAX
	 * @model name="imageG3fax" literal="image/g3fax"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_G3FAX_VALUE = 69;

	/**
	 * The '<em><b>Image Tiff</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_TIFF
	 * @model name="imageTiff" literal="image/tiff"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_TIFF_VALUE = 70;

	/**
	 * The '<em><b>Image Graphics Metafile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_GRAPHICS_METAFILE
	 * @model name="imageGraphicsMetafile" literal="image/Graphics-Metafile"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_GRAPHICS_METAFILE_VALUE = 71;

	/**
	 * The '<em><b>Image Png</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_PNG
	 * @model name="imagePng" literal="image/png"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_PNG_VALUE = 72;

	/**
	 * The '<em><b>Audio Basic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO_BASIC
	 * @model name="audioBasic" literal="audio/basic"
	 * @generated
	 * @ordered
	 */
	public static final int AUDIO_BASIC_VALUE = 73;

	/**
	 * The '<em><b>Audio32kadpcm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO32KADPCM
	 * @model name="audio32kadpcm" literal="audio/32kadpcm"
	 * @generated
	 * @ordered
	 */
	public static final int AUDIO32KADPCM_VALUE = 74;

	/**
	 * The '<em><b>Audio Mpeg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO_MPEG
	 * @model name="audioMpeg" literal="audio/mpeg"
	 * @generated
	 * @ordered
	 */
	public static final int AUDIO_MPEG_VALUE = 75;

	/**
	 * The '<em><b>Audio Parityfec</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO_PARITYFEC
	 * @model name="audioParityfec" literal="audio/parityfec"
	 * @generated
	 * @ordered
	 */
	public static final int AUDIO_PARITYFEC_VALUE = 76;

	/**
	 * The '<em><b>Audio MP4ALATM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO_MP4ALATM
	 * @model name="audioMP4ALATM" literal="audio/MP4A-LATM"
	 * @generated
	 * @ordered
	 */
	public static final int AUDIO_MP4ALATM_VALUE = 77;

	/**
	 * The '<em><b>Audio Mpa Robust</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO_MPA_ROBUST
	 * @model name="audioMpaRobust" literal="audio/mpa-robust"
	 * @generated
	 * @ordered
	 */
	public static final int AUDIO_MPA_ROBUST_VALUE = 78;

	/**
	 * The '<em><b>Video XMs Wmv</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_XMS_WMV
	 * @model name="videoXMsWmv" literal="video/x-ms-wmv"
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_XMS_WMV_VALUE = 79;

	/**
	 * The '<em><b>Video Avi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_AVI
	 * @model name="videoAvi" literal="video/avi"
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_AVI_VALUE = 80;

	/**
	 * The '<em><b>Video Mpeg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_MPEG
	 * @model name="videoMpeg" literal="video/mpeg"
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_MPEG_VALUE = 81;

	/**
	 * The '<em><b>Video Quicktime</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_QUICKTIME
	 * @model name="videoQuicktime" literal="video/quicktime"
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_QUICKTIME_VALUE = 82;

	/**
	 * The '<em><b>Video Pointer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_POINTER
	 * @model name="videoPointer" literal="video/pointer"
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_POINTER_VALUE = 83;

	/**
	 * The '<em><b>Video Parityfec</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_PARITYFEC
	 * @model name="videoParityfec" literal="video/parityfec"
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_PARITYFEC_VALUE = 84;

	/**
	 * The '<em><b>Video MP4VES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_MP4VES
	 * @model name="videoMP4VES" literal="video/MP4V-ES"
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_MP4VES_VALUE = 85;

	/**
	 * The '<em><b>Video Mp4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_MP4
	 * @model name="videoMp4" literal="video/mp4"
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_MP4_VALUE = 86;

	/**
	 * The '<em><b>Chemical XAlchemy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XALCHEMY
	 * @model name="chemicalXAlchemy" literal="chemical/x-alchemy"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XALCHEMY_VALUE = 87;

	/**
	 * The '<em><b>Chemical XCache Csf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCACHE_CSF
	 * @model name="chemicalXCacheCsf" literal="chemical/x-cache-csf"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XCACHE_CSF_VALUE = 88;

	/**
	 * The '<em><b>Chemical XCactvs Binary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCACTVS_BINARY
	 * @model name="chemicalXCactvsBinary" literal="chemical/x-cactvs-binary"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XCACTVS_BINARY_VALUE = 89;

	/**
	 * The '<em><b>Chemical XCdx</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCDX
	 * @model name="chemicalXCdx" literal="chemical/x-cdx"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XCDX_VALUE = 92;

	/**
	 * The '<em><b>Chemical XCerius</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCERIUS
	 * @model name="chemicalXCerius" literal="chemical/x-cerius"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XCERIUS_VALUE = 93;

	/**
	 * The '<em><b>Chemical XChemdraw</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCHEMDRAW
	 * @model name="chemicalXChemdraw" literal="chemical/x-chemdraw"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XCHEMDRAW_VALUE = 94;

	/**
	 * The '<em><b>Chemical XCif</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCIF
	 * @model name="chemicalXCif" literal="chemical/x-cif"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XCIF_VALUE = 95;

	/**
	 * The '<em><b>Chemical XMmcif</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XMMCIF
	 * @model name="chemicalXMmcif" literal="chemical/x-mmcif"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XMMCIF_VALUE = 96;

	/**
	 * The '<em><b>Chemical XChem3d</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCHEM3D
	 * @model name="chemicalXChem3d" literal="chemical/x-chem3d"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XCHEM3D_VALUE = 97;

	/**
	 * The '<em><b>Chemical XCmdf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCMDF
	 * @model name="chemicalXCmdf" literal="chemical/x-cmdf"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XCMDF_VALUE = 98;

	/**
	 * The '<em><b>Chemical XCompass</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCOMPASS
	 * @model name="chemicalXCompass" literal="chemical/x-compass"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XCOMPASS_VALUE = 99;

	/**
	 * The '<em><b>Chemical XCrossfire</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCROSSFIRE
	 * @model name="chemicalXCrossfire" literal="chemical/x-crossfire"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XCROSSFIRE_VALUE = 100;

	/**
	 * The '<em><b>Chemical XCml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCML
	 * @model name="chemicalXCml" literal="chemical/x-cml"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XCML_VALUE = 101;

	/**
	 * The '<em><b>Chemical XCsml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCSML
	 * @model name="chemicalXCsml" literal="chemical/x-csml"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XCSML_VALUE = 102;

	/**
	 * The '<em><b>Chemical XCtx</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCTX
	 * @model name="chemicalXCtx" literal="chemical/x-ctx"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XCTX_VALUE = 103;

	/**
	 * The '<em><b>Chemical XCxf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XCXF
	 * @model name="chemicalXCxf" literal="chemical/x-cxf"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XCXF_VALUE = 104;

	/**
	 * The '<em><b>Chemical XDaylight Smiles</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XDAYLIGHT_SMILES
	 * @model name="chemicalXDaylightSmiles" literal="chemical/x-daylight-smiles"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XDAYLIGHT_SMILES_VALUE = 105;

	/**
	 * The '<em><b>Chemical XEmbl Dl Nucleotide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XEMBL_DL_NUCLEOTIDE
	 * @model name="chemicalXEmblDlNucleotide" literal="chemical/x-embl-dl-nucleotide"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XEMBL_DL_NUCLEOTIDE_VALUE = 106;

	/**
	 * The '<em><b>Chemical XGalactic Spc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XGALACTIC_SPC
	 * @model name="chemicalXGalacticSpc" literal="chemical/x-galactic-spc"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XGALACTIC_SPC_VALUE = 107;

	/**
	 * The '<em><b>Chemical XGamess Input</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XGAMESS_INPUT
	 * @model name="chemicalXGamessInput" literal="chemical/x-gamess-input"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XGAMESS_INPUT_VALUE = 108;

	/**
	 * The '<em><b>Chemical XGaussian Input</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XGAUSSIAN_INPUT
	 * @model name="chemicalXGaussianInput" literal="chemical/x-gaussian-input"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XGAUSSIAN_INPUT_VALUE = 109;

	/**
	 * The '<em><b>Chemical XGaussian Checkpoint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XGAUSSIAN_CHECKPOINT
	 * @model name="chemicalXGaussianCheckpoint" literal="chemical/x-gaussian-checkpoint"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XGAUSSIAN_CHECKPOINT_VALUE = 110;

	/**
	 * The '<em><b>Chemical XGaussian Cube</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XGAUSSIAN_CUBE
	 * @model name="chemicalXGaussianCube" literal="chemical/x-gaussian-cube"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XGAUSSIAN_CUBE_VALUE = 111;

	/**
	 * The '<em><b>Chemical XGcg8 Sequence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XGCG8_SEQUENCE
	 * @model name="chemicalXGcg8Sequence" literal="chemical/x-gcg8-sequence"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XGCG8_SEQUENCE_VALUE = 112;

	/**
	 * The '<em><b>Chemical XGenbank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XGENBANK
	 * @model name="chemicalXGenbank" literal="chemical/x-genbank"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XGENBANK_VALUE = 113;

	/**
	 * The '<em><b>Chemical XIsostar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XISOSTAR
	 * @model name="chemicalXIsostar" literal="chemical/x-isostar"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XISOSTAR_VALUE = 114;

	/**
	 * The '<em><b>Chemical XJcamp Dx</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XJCAMP_DX
	 * @model name="chemicalXJcampDx" literal="chemical/x-jcamp-dx"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XJCAMP_DX_VALUE = 115;

	/**
	 * The '<em><b>Chemical XKinemage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XKINEMAGE
	 * @model name="chemicalXKinemage" literal="chemical/x-kinemage"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XKINEMAGE_VALUE = 116;

	/**
	 * The '<em><b>Chemical XMacmolecule</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XMACMOLECULE
	 * @model name="chemicalXMacmolecule" literal="chemical/x-macmolecule"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XMACMOLECULE_VALUE = 117;

	/**
	 * The '<em><b>Chemical XMacromodel Input</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XMACROMODEL_INPUT
	 * @model name="chemicalXMacromodelInput" literal="chemical/x-macromodel-input"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XMACROMODEL_INPUT_VALUE = 118;

	/**
	 * The '<em><b>Chemical XMdl Molfile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XMDL_MOLFILE
	 * @model name="chemicalXMdlMolfile" literal="chemical/x-mdl-molfile"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XMDL_MOLFILE_VALUE = 119;

	/**
	 * The '<em><b>Chemical XMdl Rdfile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XMDL_RDFILE
	 * @model name="chemicalXMdlRdfile" literal="chemical/x-mdl-rdfile"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XMDL_RDFILE_VALUE = 120;

	/**
	 * The '<em><b>Chemical XMdl Rxnfile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XMDL_RXNFILE
	 * @model name="chemicalXMdlRxnfile" literal="chemical/x-mdl-rxnfile"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XMDL_RXNFILE_VALUE = 121;

	/**
	 * The '<em><b>Chemical XMdl Sdfile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XMDL_SDFILE
	 * @model name="chemicalXMdlSdfile" literal="chemical/x-mdl-sdfile"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XMDL_SDFILE_VALUE = 122;

	/**
	 * The '<em><b>Chemical XMdl Tgf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XMDL_TGF
	 * @model name="chemicalXMdlTgf" literal="chemical/x-mdl-tgf"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XMDL_TGF_VALUE = 123;

	/**
	 * The '<em><b>Chemical XMif</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XMIF
	 * @model name="chemicalXMif" literal="chemical/x-mif"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XMIF_VALUE = 124;

	/**
	 * The '<em><b>Chemical XMol2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XMOL2
	 * @model name="chemicalXMol2" literal="chemical/x-mol2"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XMOL2_VALUE = 125;

	/**
	 * The '<em><b>Chemical XMolconn Z</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XMOLCONN_Z
	 * @model name="chemicalXMolconnZ" literal="chemical/x-molconn-Z"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XMOLCONN_Z_VALUE = 126;

	/**
	 * The '<em><b>Chemical XMopac Input</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XMOPAC_INPUT
	 * @model name="chemicalXMopacInput" literal="chemical/x-mopac-input"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XMOPAC_INPUT_VALUE = 127;

	/**
	 * The '<em><b>Chemical XMopac Graph</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XMOPAC_GRAPH
	 * @model name="chemicalXMopacGraph" literal="chemical/x-mopac-graph"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XMOPAC_GRAPH_VALUE = 128;

	/**
	 * The '<em><b>Chemical XNcbi Asn1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XNCBI_ASN1
	 * @model name="chemicalXNcbiAsn1" literal="chemical/x-ncbi-asn1"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XNCBI_ASN1_VALUE = 129;

	/**
	 * The '<em><b>Chemical XNcbi Asn1 Binary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XNCBI_ASN1_BINARY
	 * @model name="chemicalXNcbiAsn1Binary" literal="chemical/x-ncbi-asn1-binary"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XNCBI_ASN1_BINARY_VALUE = 130;

	/**
	 * The '<em><b>Chemical XPdb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XPDB
	 * @model name="chemicalXPdb" literal="chemical/x-pdb"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XPDB_VALUE = 131;

	/**
	 * The '<em><b>Chemical XSwissprot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XSWISSPROT
	 * @model name="chemicalXSwissprot" literal="chemical/x-swissprot"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XSWISSPROT_VALUE = 132;

	/**
	 * The '<em><b>Chemical XVamas Iso14976</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XVAMAS_ISO14976
	 * @model name="chemicalXVamasIso14976" literal="chemical/x-vamas-iso14976"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XVAMAS_ISO14976_VALUE = 133;

	/**
	 * The '<em><b>Chemical XVmd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XVMD
	 * @model name="chemicalXVmd" literal="chemical/x-vmd"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XVMD_VALUE = 134;

	/**
	 * The '<em><b>Chemical XXtel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XXTEL
	 * @model name="chemicalXXtel" literal="chemical/x-xtel"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XXTEL_VALUE = 135;

	/**
	 * The '<em><b>Chemical XXyz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_XXYZ
	 * @model name="chemicalXXyz" literal="chemical/x-xyz"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_XXYZ_VALUE = 136;

	/**
	 * The '<em><b>Model Stl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODEL_STL
	 * @model name="modelStl" literal="model/stl"
	 * @generated
	 * @ordered
	 */
	public static final int MODEL_STL_VALUE = 137;

	/**
	 * The '<em><b>Model XStl Binary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODEL_XSTL_BINARY
	 * @model name="modelXStlBinary" literal="model/x.stl-binary"
	 * @generated
	 * @ordered
	 */
	public static final int MODEL_XSTL_BINARY_VALUE = 138;

	/**
	 * The '<em><b>Model XStl Ascii</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODEL_XSTL_ASCII
	 * @model name="modelXStlAscii" literal="model/x.stl-ascii"
	 * @generated
	 * @ordered
	 */
	public static final int MODEL_XSTL_ASCII_VALUE = 139;

	/**
	 * The '<em><b>Model Vrml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODEL_VRML
	 * @model name="modelVrml" literal="model/vrml"
	 * @generated
	 * @ordered
	 */
	public static final int MODEL_VRML_VALUE = 140;

	/**
	 * The '<em><b>Audio XWav</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO_XWAV
	 * @model name="audioXWav" literal="audio/x-wav"
	 * @generated
	 * @ordered
	 */
	public static final int AUDIO_XWAV_VALUE = 141;

	/**
	 * The '<em><b>Video XFlv</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_XFLV
	 * @model name="videoXFlv" literal="video/x-flv"
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_XFLV_VALUE = 142;

	/**
	 * The '<em><b>Data Spcvue Htm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_SPCVUE_HTM
	 * @model name="DataSpcvueHtm" literal="Data/spcvue.htm"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_SPCVUE_HTM_VALUE = 143;

	/**
	 * An array of all the '<em><b>Mime Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MimeTypeType[] VALUES_ARRAY =
		new MimeTypeType[] {
			TEXT_CSS,
			TEXT_CSV,
			TEXT_ENRICHED,
			TEXT_HTML,
			TEXT_PLAIN,
			TEXT_RICHTEXT,
			TEXT_RTF,
			TEXT_SGML,
			TEXT_TAB_SEPARATED_VALUES,
			TEXT_XML,
			TEXT_XML_EXTERNAL_PARSED_ENTITY,
			MULTIPART_MIXED,
			MULTIPART_ALTERNATIVE,
			MULTIPART_DIGEST,
			MULTIPART_PARALLEL,
			MULTIPART_APPLEDOUBLE,
			MULTIPART_HEADER_SET,
			MULTIPART_FORM_DATA,
			MULTIPART_REPORT,
			MULTIPART_VOICE_MESSAGE,
			MULTIPART_SIGNED,
			MULTIPART_ENCRYPTED,
			MULTIPART_BYTERANGES,
			APPLICATION_EPS,
			APPLICATION_EPUB_ZIP,
			APPLICATION_OCTET_STREAM,
			APPLICATION_POSTSCRIPT,
			APPLICATION_RTF,
			APPLICATION_APPLEFILE,
			APPLICATION_MAC_BINHEX40,
			APPLICATION_WORDPERFECT51,
			APPLICATION_PDF,
			APPLICATION_XGZIP,
			APPLICATION_ZIP,
			APPLICATION_GZIP,
			APPLICATION_MACWRITEII,
			APPLICATION_MSWORD,
			APPLICATION_SGML,
			APPLICATION_CALS1840,
			APPLICATION_PGP_ENCRYPTED,
			APPLICATION_PGP_SIGNATURE,
			APPLICATION_PGP_KEYS,
			APPLICATION_SGML_OPEN_CATALOG,
			APPLICATION_RC,
			APPLICATION_XML,
			APPLICATION_XML_EXTERNAL_PARSED_ENTITY,
			APPLICATION_XML_DTD,
			APPLICATION_BATCH_SMTP,
			APPLICATION_IPP,
			APPLICATION_OCSP_REQUEST,
			APPLICATION_OCSP_RESPONSE,
			APPLICATION_VND_WOLFRAM_MATHEMATICA,
			APPLICATION_VND_WOLFRAM_MATHEMATICA_PACKAGE,
			APPLICATION_VND_WOLFRAM_PLAYER,
			APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT,
			APPLICATION_VND_OASIS_OPENDOCUMENT_PRESENTATION,
			APPLICATION_VND_OASIS_OPENDOCUMENT_SPREADSHEET,
			APPLICATION_VND_MS_ASF,
			APPLICATION_VND_MS_EXCEL,
			APPLICATION_VND_MS_POWERPOINT,
			APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_PRESENTATION,
			APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEET,
			APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT,
			APPLICATION_REGEX_CLINICAL_TRIAL_NUMBER,
			IMAGE_FITS,
			IMAGE_JPEG,
			IMAGE_GIF,
			IMAGE_IEF,
			IMAGE_G3FAX,
			IMAGE_TIFF,
			IMAGE_GRAPHICS_METAFILE,
			IMAGE_PNG,
			AUDIO_BASIC,
			AUDIO32KADPCM,
			AUDIO_MPEG,
			AUDIO_PARITYFEC,
			AUDIO_MP4ALATM,
			AUDIO_MPA_ROBUST,
			VIDEO_XMS_WMV,
			VIDEO_AVI,
			VIDEO_MPEG,
			VIDEO_QUICKTIME,
			VIDEO_POINTER,
			VIDEO_PARITYFEC,
			VIDEO_MP4VES,
			VIDEO_MP4,
			CHEMICAL_XALCHEMY,
			CHEMICAL_XCACHE_CSF,
			CHEMICAL_XCACTVS_BINARY,
			CHEMICAL_XCDX,
			CHEMICAL_XCERIUS,
			CHEMICAL_XCHEMDRAW,
			CHEMICAL_XCIF,
			CHEMICAL_XMMCIF,
			CHEMICAL_XCHEM3D,
			CHEMICAL_XCMDF,
			CHEMICAL_XCOMPASS,
			CHEMICAL_XCROSSFIRE,
			CHEMICAL_XCML,
			CHEMICAL_XCSML,
			CHEMICAL_XCTX,
			CHEMICAL_XCXF,
			CHEMICAL_XDAYLIGHT_SMILES,
			CHEMICAL_XEMBL_DL_NUCLEOTIDE,
			CHEMICAL_XGALACTIC_SPC,
			CHEMICAL_XGAMESS_INPUT,
			CHEMICAL_XGAUSSIAN_INPUT,
			CHEMICAL_XGAUSSIAN_CHECKPOINT,
			CHEMICAL_XGAUSSIAN_CUBE,
			CHEMICAL_XGCG8_SEQUENCE,
			CHEMICAL_XGENBANK,
			CHEMICAL_XISOSTAR,
			CHEMICAL_XJCAMP_DX,
			CHEMICAL_XKINEMAGE,
			CHEMICAL_XMACMOLECULE,
			CHEMICAL_XMACROMODEL_INPUT,
			CHEMICAL_XMDL_MOLFILE,
			CHEMICAL_XMDL_RDFILE,
			CHEMICAL_XMDL_RXNFILE,
			CHEMICAL_XMDL_SDFILE,
			CHEMICAL_XMDL_TGF,
			CHEMICAL_XMIF,
			CHEMICAL_XMOL2,
			CHEMICAL_XMOLCONN_Z,
			CHEMICAL_XMOPAC_INPUT,
			CHEMICAL_XMOPAC_GRAPH,
			CHEMICAL_XNCBI_ASN1,
			CHEMICAL_XNCBI_ASN1_BINARY,
			CHEMICAL_XPDB,
			CHEMICAL_XSWISSPROT,
			CHEMICAL_XVAMAS_ISO14976,
			CHEMICAL_XVMD,
			CHEMICAL_XXTEL,
			CHEMICAL_XXYZ,
			MODEL_STL,
			MODEL_XSTL_BINARY,
			MODEL_XSTL_ASCII,
			MODEL_VRML,
			AUDIO_XWAV,
			VIDEO_XFLV,
			DATA_SPCVUE_HTM,
		};

	/**
	 * A public read-only list of all the '<em><b>Mime Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MimeTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mime Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MimeTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MimeTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mime Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MimeTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MimeTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mime Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MimeTypeType get(int value) {
		switch (value) {
			case TEXT_CSS_VALUE: return TEXT_CSS;
			case TEXT_CSV_VALUE: return TEXT_CSV;
			case TEXT_ENRICHED_VALUE: return TEXT_ENRICHED;
			case TEXT_HTML_VALUE: return TEXT_HTML;
			case TEXT_PLAIN_VALUE: return TEXT_PLAIN;
			case TEXT_RICHTEXT_VALUE: return TEXT_RICHTEXT;
			case TEXT_RTF_VALUE: return TEXT_RTF;
			case TEXT_SGML_VALUE: return TEXT_SGML;
			case TEXT_TAB_SEPARATED_VALUES_VALUE: return TEXT_TAB_SEPARATED_VALUES;
			case TEXT_XML_VALUE: return TEXT_XML;
			case TEXT_XML_EXTERNAL_PARSED_ENTITY_VALUE: return TEXT_XML_EXTERNAL_PARSED_ENTITY;
			case MULTIPART_MIXED_VALUE: return MULTIPART_MIXED;
			case MULTIPART_ALTERNATIVE_VALUE: return MULTIPART_ALTERNATIVE;
			case MULTIPART_DIGEST_VALUE: return MULTIPART_DIGEST;
			case MULTIPART_PARALLEL_VALUE: return MULTIPART_PARALLEL;
			case MULTIPART_APPLEDOUBLE_VALUE: return MULTIPART_APPLEDOUBLE;
			case MULTIPART_HEADER_SET_VALUE: return MULTIPART_HEADER_SET;
			case MULTIPART_FORM_DATA_VALUE: return MULTIPART_FORM_DATA;
			case MULTIPART_REPORT_VALUE: return MULTIPART_REPORT;
			case MULTIPART_VOICE_MESSAGE_VALUE: return MULTIPART_VOICE_MESSAGE;
			case MULTIPART_SIGNED_VALUE: return MULTIPART_SIGNED;
			case MULTIPART_ENCRYPTED_VALUE: return MULTIPART_ENCRYPTED;
			case MULTIPART_BYTERANGES_VALUE: return MULTIPART_BYTERANGES;
			case APPLICATION_EPS_VALUE: return APPLICATION_EPS;
			case APPLICATION_EPUB_ZIP_VALUE: return APPLICATION_EPUB_ZIP;
			case APPLICATION_OCTET_STREAM_VALUE: return APPLICATION_OCTET_STREAM;
			case APPLICATION_POSTSCRIPT_VALUE: return APPLICATION_POSTSCRIPT;
			case APPLICATION_RTF_VALUE: return APPLICATION_RTF;
			case APPLICATION_APPLEFILE_VALUE: return APPLICATION_APPLEFILE;
			case APPLICATION_MAC_BINHEX40_VALUE: return APPLICATION_MAC_BINHEX40;
			case APPLICATION_WORDPERFECT51_VALUE: return APPLICATION_WORDPERFECT51;
			case APPLICATION_PDF_VALUE: return APPLICATION_PDF;
			case APPLICATION_XGZIP_VALUE: return APPLICATION_XGZIP;
			case APPLICATION_ZIP_VALUE: return APPLICATION_ZIP;
			case APPLICATION_GZIP_VALUE: return APPLICATION_GZIP;
			case APPLICATION_MACWRITEII_VALUE: return APPLICATION_MACWRITEII;
			case APPLICATION_MSWORD_VALUE: return APPLICATION_MSWORD;
			case APPLICATION_SGML_VALUE: return APPLICATION_SGML;
			case APPLICATION_CALS1840_VALUE: return APPLICATION_CALS1840;
			case APPLICATION_PGP_ENCRYPTED_VALUE: return APPLICATION_PGP_ENCRYPTED;
			case APPLICATION_PGP_SIGNATURE_VALUE: return APPLICATION_PGP_SIGNATURE;
			case APPLICATION_PGP_KEYS_VALUE: return APPLICATION_PGP_KEYS;
			case APPLICATION_SGML_OPEN_CATALOG_VALUE: return APPLICATION_SGML_OPEN_CATALOG;
			case APPLICATION_RC_VALUE: return APPLICATION_RC;
			case APPLICATION_XML_VALUE: return APPLICATION_XML;
			case APPLICATION_XML_EXTERNAL_PARSED_ENTITY_VALUE: return APPLICATION_XML_EXTERNAL_PARSED_ENTITY;
			case APPLICATION_XML_DTD_VALUE: return APPLICATION_XML_DTD;
			case APPLICATION_BATCH_SMTP_VALUE: return APPLICATION_BATCH_SMTP;
			case APPLICATION_IPP_VALUE: return APPLICATION_IPP;
			case APPLICATION_OCSP_REQUEST_VALUE: return APPLICATION_OCSP_REQUEST;
			case APPLICATION_OCSP_RESPONSE_VALUE: return APPLICATION_OCSP_RESPONSE;
			case APPLICATION_VND_WOLFRAM_MATHEMATICA_VALUE: return APPLICATION_VND_WOLFRAM_MATHEMATICA;
			case APPLICATION_VND_WOLFRAM_MATHEMATICA_PACKAGE_VALUE: return APPLICATION_VND_WOLFRAM_MATHEMATICA_PACKAGE;
			case APPLICATION_VND_WOLFRAM_PLAYER_VALUE: return APPLICATION_VND_WOLFRAM_PLAYER;
			case APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT_VALUE: return APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT;
			case APPLICATION_VND_OASIS_OPENDOCUMENT_PRESENTATION_VALUE: return APPLICATION_VND_OASIS_OPENDOCUMENT_PRESENTATION;
			case APPLICATION_VND_OASIS_OPENDOCUMENT_SPREADSHEET_VALUE: return APPLICATION_VND_OASIS_OPENDOCUMENT_SPREADSHEET;
			case APPLICATION_VND_MS_ASF_VALUE: return APPLICATION_VND_MS_ASF;
			case APPLICATION_VND_MS_EXCEL_VALUE: return APPLICATION_VND_MS_EXCEL;
			case APPLICATION_VND_MS_POWERPOINT_VALUE: return APPLICATION_VND_MS_POWERPOINT;
			case APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_PRESENTATION_VALUE: return APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_PRESENTATION;
			case APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEET_VALUE: return APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEET;
			case APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT_VALUE: return APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT;
			case APPLICATION_REGEX_CLINICAL_TRIAL_NUMBER_VALUE: return APPLICATION_REGEX_CLINICAL_TRIAL_NUMBER;
			case IMAGE_FITS_VALUE: return IMAGE_FITS;
			case IMAGE_JPEG_VALUE: return IMAGE_JPEG;
			case IMAGE_GIF_VALUE: return IMAGE_GIF;
			case IMAGE_IEF_VALUE: return IMAGE_IEF;
			case IMAGE_G3FAX_VALUE: return IMAGE_G3FAX;
			case IMAGE_TIFF_VALUE: return IMAGE_TIFF;
			case IMAGE_GRAPHICS_METAFILE_VALUE: return IMAGE_GRAPHICS_METAFILE;
			case IMAGE_PNG_VALUE: return IMAGE_PNG;
			case AUDIO_BASIC_VALUE: return AUDIO_BASIC;
			case AUDIO32KADPCM_VALUE: return AUDIO32KADPCM;
			case AUDIO_MPEG_VALUE: return AUDIO_MPEG;
			case AUDIO_PARITYFEC_VALUE: return AUDIO_PARITYFEC;
			case AUDIO_MP4ALATM_VALUE: return AUDIO_MP4ALATM;
			case AUDIO_MPA_ROBUST_VALUE: return AUDIO_MPA_ROBUST;
			case VIDEO_XMS_WMV_VALUE: return VIDEO_XMS_WMV;
			case VIDEO_AVI_VALUE: return VIDEO_AVI;
			case VIDEO_MPEG_VALUE: return VIDEO_MPEG;
			case VIDEO_QUICKTIME_VALUE: return VIDEO_QUICKTIME;
			case VIDEO_POINTER_VALUE: return VIDEO_POINTER;
			case VIDEO_PARITYFEC_VALUE: return VIDEO_PARITYFEC;
			case VIDEO_MP4VES_VALUE: return VIDEO_MP4VES;
			case VIDEO_MP4_VALUE: return VIDEO_MP4;
			case CHEMICAL_XALCHEMY_VALUE: return CHEMICAL_XALCHEMY;
			case CHEMICAL_XCACHE_CSF_VALUE: return CHEMICAL_XCACHE_CSF;
			case CHEMICAL_XCACTVS_BINARY_VALUE: return CHEMICAL_XCACTVS_BINARY;
			case CHEMICAL_XCDX_VALUE: return CHEMICAL_XCDX;
			case CHEMICAL_XCERIUS_VALUE: return CHEMICAL_XCERIUS;
			case CHEMICAL_XCHEMDRAW_VALUE: return CHEMICAL_XCHEMDRAW;
			case CHEMICAL_XCIF_VALUE: return CHEMICAL_XCIF;
			case CHEMICAL_XMMCIF_VALUE: return CHEMICAL_XMMCIF;
			case CHEMICAL_XCHEM3D_VALUE: return CHEMICAL_XCHEM3D;
			case CHEMICAL_XCMDF_VALUE: return CHEMICAL_XCMDF;
			case CHEMICAL_XCOMPASS_VALUE: return CHEMICAL_XCOMPASS;
			case CHEMICAL_XCROSSFIRE_VALUE: return CHEMICAL_XCROSSFIRE;
			case CHEMICAL_XCML_VALUE: return CHEMICAL_XCML;
			case CHEMICAL_XCSML_VALUE: return CHEMICAL_XCSML;
			case CHEMICAL_XCTX_VALUE: return CHEMICAL_XCTX;
			case CHEMICAL_XCXF_VALUE: return CHEMICAL_XCXF;
			case CHEMICAL_XDAYLIGHT_SMILES_VALUE: return CHEMICAL_XDAYLIGHT_SMILES;
			case CHEMICAL_XEMBL_DL_NUCLEOTIDE_VALUE: return CHEMICAL_XEMBL_DL_NUCLEOTIDE;
			case CHEMICAL_XGALACTIC_SPC_VALUE: return CHEMICAL_XGALACTIC_SPC;
			case CHEMICAL_XGAMESS_INPUT_VALUE: return CHEMICAL_XGAMESS_INPUT;
			case CHEMICAL_XGAUSSIAN_INPUT_VALUE: return CHEMICAL_XGAUSSIAN_INPUT;
			case CHEMICAL_XGAUSSIAN_CHECKPOINT_VALUE: return CHEMICAL_XGAUSSIAN_CHECKPOINT;
			case CHEMICAL_XGAUSSIAN_CUBE_VALUE: return CHEMICAL_XGAUSSIAN_CUBE;
			case CHEMICAL_XGCG8_SEQUENCE_VALUE: return CHEMICAL_XGCG8_SEQUENCE;
			case CHEMICAL_XGENBANK_VALUE: return CHEMICAL_XGENBANK;
			case CHEMICAL_XISOSTAR_VALUE: return CHEMICAL_XISOSTAR;
			case CHEMICAL_XJCAMP_DX_VALUE: return CHEMICAL_XJCAMP_DX;
			case CHEMICAL_XKINEMAGE_VALUE: return CHEMICAL_XKINEMAGE;
			case CHEMICAL_XMACMOLECULE_VALUE: return CHEMICAL_XMACMOLECULE;
			case CHEMICAL_XMACROMODEL_INPUT_VALUE: return CHEMICAL_XMACROMODEL_INPUT;
			case CHEMICAL_XMDL_MOLFILE_VALUE: return CHEMICAL_XMDL_MOLFILE;
			case CHEMICAL_XMDL_RDFILE_VALUE: return CHEMICAL_XMDL_RDFILE;
			case CHEMICAL_XMDL_RXNFILE_VALUE: return CHEMICAL_XMDL_RXNFILE;
			case CHEMICAL_XMDL_SDFILE_VALUE: return CHEMICAL_XMDL_SDFILE;
			case CHEMICAL_XMDL_TGF_VALUE: return CHEMICAL_XMDL_TGF;
			case CHEMICAL_XMIF_VALUE: return CHEMICAL_XMIF;
			case CHEMICAL_XMOL2_VALUE: return CHEMICAL_XMOL2;
			case CHEMICAL_XMOLCONN_Z_VALUE: return CHEMICAL_XMOLCONN_Z;
			case CHEMICAL_XMOPAC_INPUT_VALUE: return CHEMICAL_XMOPAC_INPUT;
			case CHEMICAL_XMOPAC_GRAPH_VALUE: return CHEMICAL_XMOPAC_GRAPH;
			case CHEMICAL_XNCBI_ASN1_VALUE: return CHEMICAL_XNCBI_ASN1;
			case CHEMICAL_XNCBI_ASN1_BINARY_VALUE: return CHEMICAL_XNCBI_ASN1_BINARY;
			case CHEMICAL_XPDB_VALUE: return CHEMICAL_XPDB;
			case CHEMICAL_XSWISSPROT_VALUE: return CHEMICAL_XSWISSPROT;
			case CHEMICAL_XVAMAS_ISO14976_VALUE: return CHEMICAL_XVAMAS_ISO14976;
			case CHEMICAL_XVMD_VALUE: return CHEMICAL_XVMD;
			case CHEMICAL_XXTEL_VALUE: return CHEMICAL_XXTEL;
			case CHEMICAL_XXYZ_VALUE: return CHEMICAL_XXYZ;
			case MODEL_STL_VALUE: return MODEL_STL;
			case MODEL_XSTL_BINARY_VALUE: return MODEL_XSTL_BINARY;
			case MODEL_XSTL_ASCII_VALUE: return MODEL_XSTL_ASCII;
			case MODEL_VRML_VALUE: return MODEL_VRML;
			case AUDIO_XWAV_VALUE: return AUDIO_XWAV;
			case VIDEO_XFLV_VALUE: return VIDEO_XFLV;
			case DATA_SPCVUE_HTM_VALUE: return DATA_SPCVUE_HTM;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MimeTypeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //MimeTypeType
