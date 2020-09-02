/**
 */
package gov.nih.nlm.ncbi.jats1;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAbbrevJournalTitle <em>Abbrev Journal Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAccessDate <em>Access Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAck <em>Ack</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAddrLine <em>Addr Line</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAddress <em>Address</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAff <em>Aff</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAffAlternatives <em>Aff Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAltText <em>Alt Text</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAltTitle <em>Alt Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAnonymous <em>Anonymous</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getApp <em>App</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAppGroup <em>App Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getArray <em>Array</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getArticle <em>Article</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getArticleCategories <em>Article Categories</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getArticleId <em>Article Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getArticleMeta <em>Article Meta</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getArticleTitle <em>Article Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getArticleVersion <em>Article Version</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getArticleVersionAlternatives <em>Article Version Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAttrib <em>Attrib</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAuthorComment <em>Author Comment</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAuthorNotes <em>Author Notes</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAwardGroup <em>Award Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAwardId <em>Award Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getBack <em>Back</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getBio <em>Bio</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getBody <em>Body</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getBold <em>Bold</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getBoxedText <em>Boxed Text</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getBreak <em>Break</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCaption <em>Caption</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getChapterTitle <em>Chapter Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getChemStruct <em>Chem Struct</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getChemStructWrap <em>Chem Struct Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCitationAlternatives <em>Citation Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCity <em>City</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCode <em>Code</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCol <em>Col</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getColgroup <em>Colgroup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCollab <em>Collab</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCollabAlternatives <em>Collab Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getComment <em>Comment</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCompoundKwd <em>Compound Kwd</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCompoundKwdPart <em>Compound Kwd Part</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCompoundSubject <em>Compound Subject</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCompoundSubjectPart <em>Compound Subject Part</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getConfAcronym <em>Conf Acronym</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getConfDate <em>Conf Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getConfLoc <em>Conf Loc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getConfName <em>Conf Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getConfNum <em>Conf Num</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getConfSponsor <em>Conf Sponsor</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getConfTheme <em>Conf Theme</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getConference <em>Conference</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getContrib <em>Contrib</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getContribGroup <em>Contrib Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getContribId <em>Contrib Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getContributedResourceGroup <em>Contributed Resource Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCopyrightHolder <em>Copyright Holder</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCopyrightStatement <em>Copyright Statement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCopyrightYear <em>Copyright Year</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCorresp <em>Corresp</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCount <em>Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCountry <em>Country</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCounts <em>Counts</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCustomMeta <em>Custom Meta</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCustomMetaGroup <em>Custom Meta Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getDataTitle <em>Data Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getDate <em>Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getDateInCitation <em>Date In Citation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getDay <em>Day</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getDef <em>Def</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getDefHead <em>Def Head</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getDefItem <em>Def Item</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getDefList <em>Def List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getDispFormula <em>Disp Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getDispFormulaGroup <em>Disp Formula Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getDispQuote <em>Disp Quote</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getEdition <em>Edition</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getElementCitation <em>Element Citation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getElocationId <em>Elocation Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getEquationCount <em>Equation Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getEra <em>Era</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getEtal <em>Etal</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getEvent <em>Event</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getEventDesc <em>Event Desc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFax <em>Fax</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFig <em>Fig</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFigCount <em>Fig Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFigGroup <em>Fig Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFixedCase <em>Fixed Case</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFloatsGroup <em>Floats Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFn <em>Fn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFnGroup <em>Fn Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFpage <em>Fpage</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFront <em>Front</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFrontStub <em>Front Stub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFundingGroup <em>Funding Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFundingSource <em>Funding Source</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFundingStatement <em>Funding Statement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getGivenNames <em>Given Names</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getGlossary <em>Glossary</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getGlyphData <em>Glyph Data</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getGlyphRef <em>Glyph Ref</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getGov <em>Gov</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getGraphic <em>Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getHistory <em>History</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getHr <em>Hr</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getIndexTerm <em>Index Term</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getIndexTermRangeEnd <em>Index Term Range End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getInlineFormula <em>Inline Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getInlineGraphic <em>Inline Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getInlineMedia <em>Inline Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getInlineSupplementaryMaterial <em>Inline Supplementary Material</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getInstitution <em>Institution</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getInstitutionId <em>Institution Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getInstitutionWrap <em>Institution Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getIssn <em>Issn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getIssnL <em>Issn L</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getIssue <em>Issue</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getIssueId <em>Issue Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getIssuePart <em>Issue Part</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getIssueSponsor <em>Issue Sponsor</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getIssueTitle <em>Issue Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getItalic <em>Italic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getJournalId <em>Journal Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getJournalMeta <em>Journal Meta</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getJournalSubtitle <em>Journal Subtitle</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getJournalTitle <em>Journal Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getJournalTitleGroup <em>Journal Title Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getKwd <em>Kwd</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getKwdGroup <em>Kwd Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getLabel <em>Label</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getLicense <em>License</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getLicenseP <em>License P</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getList <em>List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getListItem <em>List Item</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getLongDesc <em>Long Desc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getLpage <em>Lpage</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getMedia <em>Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getMetaName <em>Meta Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getMetaValue <em>Meta Value</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getMilestoneEnd <em>Milestone End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getMilestoneStart <em>Milestone Start</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getMixedCitation <em>Mixed Citation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getMonospace <em>Monospace</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getMonth <em>Month</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getName <em>Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getNameAlternatives <em>Name Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getNamedContent <em>Named Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getNestedKwd <em>Nested Kwd</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getNlmCitation <em>Nlm Citation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getNote <em>Note</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getNotes <em>Notes</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getObjectId <em>Object Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getOnBehalfOf <em>On Behalf Of</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getOpenAccess <em>Open Access</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getOverline <em>Overline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getOverlineEnd <em>Overline End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getOverlineStart <em>Overline Start</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getP <em>P</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPageCount <em>Page Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPageRange <em>Page Range</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPartTitle <em>Part Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPatent <em>Patent</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPersonGroup <em>Person Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPhone <em>Phone</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPreformat <em>Preformat</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPrice <em>Price</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPrincipalAwardRecipient <em>Principal Award Recipient</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPrincipalInvestigator <em>Principal Investigator</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPrivateChar <em>Private Char</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getProduct <em>Product</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPubDate <em>Pub Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPubDateNotAvailable <em>Pub Date Not Available</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPubHistory <em>Pub History</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPubId <em>Pub Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPublisherLoc <em>Publisher Loc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPublisherName <em>Publisher Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getRb <em>Rb</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getRef <em>Ref</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getRefCount <em>Ref Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getRefList <em>Ref List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getRelatedArticle <em>Related Article</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getRelatedObject <em>Related Object</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getResourceGroup <em>Resource Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getResourceId <em>Resource Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getResourceName <em>Resource Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getResourceWrap <em>Resource Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getResponse <em>Response</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getRole <em>Role</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getRoman <em>Roman</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getRp <em>Rp</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getRt <em>Rt</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getRuby <em>Ruby</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSansSerif <em>Sans Serif</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSc <em>Sc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSeason <em>Season</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSec <em>Sec</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSecMeta <em>Sec Meta</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSee <em>See</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSeeAlso <em>See Also</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSelfUri <em>Self Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSeries <em>Series</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSeriesText <em>Series Text</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSeriesTitle <em>Series Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSig <em>Sig</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSigBlock <em>Sig Block</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSize <em>Size</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSource <em>Source</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSpeaker <em>Speaker</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSpeech <em>Speech</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getState <em>State</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getStatement <em>Statement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getStd <em>Std</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getStdOrganization <em>Std Organization</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getStrike <em>Strike</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getStringConf <em>String Conf</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getStringDate <em>String Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getStringName <em>String Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getStyledContent <em>Styled Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSubArticle <em>Sub Article</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSubjGroup <em>Subj Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSubject <em>Subject</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSupplement <em>Supplement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSupplementaryMaterial <em>Supplementary Material</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSupportDescription <em>Support Description</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSupportGroup <em>Support Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSupportSource <em>Support Source</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSurname <em>Surname</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTable <em>Table</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTableCount <em>Table Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTableWrap <em>Table Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTableWrapFoot <em>Table Wrap Foot</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTableWrapGroup <em>Table Wrap Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTarget <em>Target</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTbody <em>Tbody</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTd <em>Td</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTerm <em>Term</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTermHead <em>Term Head</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTexMath <em>Tex Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTextualForm <em>Textual Form</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTfoot <em>Tfoot</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTh <em>Th</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getThead <em>Thead</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTitleGroup <em>Title Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTr <em>Tr</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTransAbstract <em>Trans Abstract</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTransSource <em>Trans Source</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTransSubtitle <em>Trans Subtitle</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTransTitle <em>Trans Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTransTitleGroup <em>Trans Title Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getUnderline <em>Underline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getUnderlineEnd <em>Underline End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getUnderlineStart <em>Underline Start</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getUnstructuredKwdGroup <em>Unstructured Kwd Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getVerseGroup <em>Verse Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getVerseLine <em>Verse Line</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getVersion <em>Version</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getVolume <em>Volume</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getVolumeId <em>Volume Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getVolumeIssueGroup <em>Volume Issue Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getVolumeSeries <em>Volume Series</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getWordCount <em>Word Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getX <em>X</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getXref <em>Xref</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Abbrev</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Abbreviation or Acronym</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abbrev</em>' containment reference.
	 * @see #setAbbrev(AbbrevType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Abbrev()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abbrev' namespace='##targetNamespace'"
	 * @generated
	 */
	AbbrevType getAbbrev();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAbbrev <em>Abbrev</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbrev</em>' containment reference.
	 * @see #getAbbrev()
	 * @generated
	 */
	void setAbbrev(AbbrevType value);

	/**
	 * Returns the value of the '<em><b>Abbrev Journal Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Abbreviated Journal Title</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abbrev Journal Title</em>' containment reference.
	 * @see #setAbbrevJournalTitle(AbbrevJournalTitleType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_AbbrevJournalTitle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abbrev-journal-title' namespace='##targetNamespace'"
	 * @generated
	 */
	AbbrevJournalTitleType getAbbrevJournalTitle();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAbbrevJournalTitle <em>Abbrev Journal Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbrev Journal Title</em>' containment reference.
	 * @see #getAbbrevJournalTitle()
	 * @generated
	 */
	void setAbbrevJournalTitle(AbbrevJournalTitleType value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Abstract</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract</em>' containment reference.
	 * @see #setAbstract(AbstractType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Abstract()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractType getAbstract();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAbstract <em>Abstract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' containment reference.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(AbstractType value);

	/**
	 * Returns the value of the '<em><b>Access Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Access Date For Cited Work</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Date</em>' containment reference.
	 * @see #setAccessDate(AccessDateType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_AccessDate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='access-date' namespace='##targetNamespace'"
	 * @generated
	 */
	AccessDateType getAccessDate();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAccessDate <em>Access Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Date</em>' containment reference.
	 * @see #getAccessDate()
	 * @generated
	 */
	void setAccessDate(AccessDateType value);

	/**
	 * Returns the value of the '<em><b>Ack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Acknowledgments</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ack</em>' containment reference.
	 * @see #setAck(AckType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Ack()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ack' namespace='##targetNamespace'"
	 * @generated
	 */
	AckType getAck();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAck <em>Ack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ack</em>' containment reference.
	 * @see #getAck()
	 * @generated
	 */
	void setAck(AckType value);

	/**
	 * Returns the value of the '<em><b>Addr Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Address Line</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Addr Line</em>' containment reference.
	 * @see #setAddrLine(AddrLineType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_AddrLine()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addr-line' namespace='##targetNamespace'"
	 * @generated
	 */
	AddrLineType getAddrLine();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAddrLine <em>Addr Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addr Line</em>' containment reference.
	 * @see #getAddrLine()
	 * @generated
	 */
	void setAddrLine(AddrLineType value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Address/Contact Information</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(AddressType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Address()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressType getAddress();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(AddressType value);

	/**
	 * Returns the value of the '<em><b>Aff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Affiliation</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aff</em>' containment reference.
	 * @see #setAff(AffType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Aff()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='aff' namespace='##targetNamespace'"
	 * @generated
	 */
	AffType getAff();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAff <em>Aff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aff</em>' containment reference.
	 * @see #getAff()
	 * @generated
	 */
	void setAff(AffType value);

	/**
	 * Returns the value of the '<em><b>Aff Alternatives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Affiliation Alternatives</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aff Alternatives</em>' containment reference.
	 * @see #setAffAlternatives(AffAlternativesType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_AffAlternatives()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='aff-alternatives' namespace='##targetNamespace'"
	 * @generated
	 */
	AffAlternativesType getAffAlternatives();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAffAlternatives <em>Aff Alternatives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aff Alternatives</em>' containment reference.
	 * @see #getAffAlternatives()
	 * @generated
	 */
	void setAffAlternatives(AffAlternativesType value);

	/**
	 * Returns the value of the '<em><b>Alt Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Alternate Title Text For a Figure, Etc.</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alt Text</em>' containment reference.
	 * @see #setAltText(AltTextType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_AltText()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alt-text' namespace='##targetNamespace'"
	 * @generated
	 */
	AltTextType getAltText();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAltText <em>Alt Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Text</em>' containment reference.
	 * @see #getAltText()
	 * @generated
	 */
	void setAltText(AltTextType value);

	/**
	 * Returns the value of the '<em><b>Alt Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Alternate Title</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alt Title</em>' containment reference.
	 * @see #setAltTitle(AltTitleType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_AltTitle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alt-title' namespace='##targetNamespace'"
	 * @generated
	 */
	AltTitleType getAltTitle();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAltTitle <em>Alt Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Title</em>' containment reference.
	 * @see #getAltTitle()
	 * @generated
	 */
	void setAltTitle(AltTitleType value);

	/**
	 * Returns the value of the '<em><b>Alternatives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Alternatives For Processing</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternatives</em>' containment reference.
	 * @see #setAlternatives(AlternativesType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Alternatives()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alternatives' namespace='##targetNamespace'"
	 * @generated
	 */
	AlternativesType getAlternatives();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAlternatives <em>Alternatives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternatives</em>' containment reference.
	 * @see #getAlternatives()
	 * @generated
	 */
	void setAlternatives(AlternativesType value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Annotation in a Citation</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(AnnotationType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Annotation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
	 * @generated
	 */
	AnnotationType getAnnotation();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(AnnotationType value);

	/**
	 * Returns the value of the '<em><b>Anonymous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Anonymous</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anonymous</em>' containment reference.
	 * @see #setAnonymous(AnonymousType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Anonymous()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='anonymous' namespace='##targetNamespace'"
	 * @generated
	 */
	AnonymousType getAnonymous();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAnonymous <em>Anonymous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anonymous</em>' containment reference.
	 * @see #getAnonymous()
	 * @generated
	 */
	void setAnonymous(AnonymousType value);

	/**
	 * Returns the value of the '<em><b>App</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Appendix</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>App</em>' containment reference.
	 * @see #setApp(AppType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_App()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='app' namespace='##targetNamespace'"
	 * @generated
	 */
	AppType getApp();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getApp <em>App</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App</em>' containment reference.
	 * @see #getApp()
	 * @generated
	 */
	void setApp(AppType value);

	/**
	 * Returns the value of the '<em><b>App Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Appendix Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>App Group</em>' containment reference.
	 * @see #setAppGroup(AppGroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_AppGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='app-group' namespace='##targetNamespace'"
	 * @generated
	 */
	AppGroupType getAppGroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAppGroup <em>App Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Group</em>' containment reference.
	 * @see #getAppGroup()
	 * @generated
	 */
	void setAppGroup(AppGroupType value);

	/**
	 * Returns the value of the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Array (Simple Tabular Array)</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Array</em>' containment reference.
	 * @see #setArray(ArrayType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Array()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='array' namespace='##targetNamespace'"
	 * @generated
	 */
	ArrayType getArray();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getArray <em>Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' containment reference.
	 * @see #getArray()
	 * @generated
	 */
	void setArray(ArrayType value);

	/**
	 * Returns the value of the '<em><b>Article</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Article</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Article</em>' containment reference.
	 * @see #setArticle(ArticleType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Article()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='article' namespace='##targetNamespace'"
	 * @generated
	 */
	ArticleType getArticle();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getArticle <em>Article</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Article</em>' containment reference.
	 * @see #getArticle()
	 * @generated
	 */
	void setArticle(ArticleType value);

	/**
	 * Returns the value of the '<em><b>Article Categories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Article Grouping Data</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Article Categories</em>' containment reference.
	 * @see #setArticleCategories(ArticleCategoriesType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ArticleCategories()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='article-categories' namespace='##targetNamespace'"
	 * @generated
	 */
	ArticleCategoriesType getArticleCategories();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getArticleCategories <em>Article Categories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Article Categories</em>' containment reference.
	 * @see #getArticleCategories()
	 * @generated
	 */
	void setArticleCategories(ArticleCategoriesType value);

	/**
	 * Returns the value of the '<em><b>Article Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Article Identifier</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Article Id</em>' containment reference.
	 * @see #setArticleId(ArticleIdType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ArticleId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='article-id' namespace='##targetNamespace'"
	 * @generated
	 */
	ArticleIdType getArticleId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getArticleId <em>Article Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Article Id</em>' containment reference.
	 * @see #getArticleId()
	 * @generated
	 */
	void setArticleId(ArticleIdType value);

	/**
	 * Returns the value of the '<em><b>Article Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Article Metadata</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Article Meta</em>' containment reference.
	 * @see #setArticleMeta(ArticleMetaType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ArticleMeta()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='article-meta' namespace='##targetNamespace'"
	 * @generated
	 */
	ArticleMetaType getArticleMeta();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getArticleMeta <em>Article Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Article Meta</em>' containment reference.
	 * @see #getArticleMeta()
	 * @generated
	 */
	void setArticleMeta(ArticleMetaType value);

	/**
	 * Returns the value of the '<em><b>Article Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Article Title</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Article Title</em>' containment reference.
	 * @see #setArticleTitle(ArticleTitleType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ArticleTitle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='article-title' namespace='##targetNamespace'"
	 * @generated
	 */
	ArticleTitleType getArticleTitle();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getArticleTitle <em>Article Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Article Title</em>' containment reference.
	 * @see #getArticleTitle()
	 * @generated
	 */
	void setArticleTitle(ArticleTitleType value);

	/**
	 * Returns the value of the '<em><b>Article Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Article Version</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Article Version</em>' containment reference.
	 * @see #setArticleVersion(ArticleVersionType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ArticleVersion()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='article-version' namespace='##targetNamespace'"
	 * @generated
	 */
	ArticleVersionType getArticleVersion();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getArticleVersion <em>Article Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Article Version</em>' containment reference.
	 * @see #getArticleVersion()
	 * @generated
	 */
	void setArticleVersion(ArticleVersionType value);

	/**
	 * Returns the value of the '<em><b>Article Version Alternatives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Article Version Alternatives</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Article Version Alternatives</em>' containment reference.
	 * @see #setArticleVersionAlternatives(ArticleVersionAlternativesType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ArticleVersionAlternatives()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='article-version-alternatives' namespace='##targetNamespace'"
	 * @generated
	 */
	ArticleVersionAlternativesType getArticleVersionAlternatives();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getArticleVersionAlternatives <em>Article Version Alternatives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Article Version Alternatives</em>' containment reference.
	 * @see #getArticleVersionAlternatives()
	 * @generated
	 */
	void setArticleVersionAlternatives(ArticleVersionAlternativesType value);

	/**
	 * Returns the value of the '<em><b>Attrib</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Attribution</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attrib</em>' containment reference.
	 * @see #setAttrib(AttribType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Attrib()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='attrib' namespace='##targetNamespace'"
	 * @generated
	 */
	AttribType getAttrib();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAttrib <em>Attrib</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attrib</em>' containment reference.
	 * @see #getAttrib()
	 * @generated
	 */
	void setAttrib(AttribType value);

	/**
	 * Returns the value of the '<em><b>Author Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Author Comment</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author Comment</em>' containment reference.
	 * @see #setAuthorComment(AuthorCommentType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_AuthorComment()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='author-comment' namespace='##targetNamespace'"
	 * @generated
	 */
	AuthorCommentType getAuthorComment();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAuthorComment <em>Author Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Comment</em>' containment reference.
	 * @see #getAuthorComment()
	 * @generated
	 */
	void setAuthorComment(AuthorCommentType value);

	/**
	 * Returns the value of the '<em><b>Author Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Author Note Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author Notes</em>' containment reference.
	 * @see #setAuthorNotes(AuthorNotesType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_AuthorNotes()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='author-notes' namespace='##targetNamespace'"
	 * @generated
	 */
	AuthorNotesType getAuthorNotes();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAuthorNotes <em>Author Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Notes</em>' containment reference.
	 * @see #getAuthorNotes()
	 * @generated
	 */
	void setAuthorNotes(AuthorNotesType value);

	/**
	 * Returns the value of the '<em><b>Award Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Award Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Award Group</em>' containment reference.
	 * @see #setAwardGroup(AwardGroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_AwardGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='award-group' namespace='##targetNamespace'"
	 * @generated
	 */
	AwardGroupType getAwardGroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAwardGroup <em>Award Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Award Group</em>' containment reference.
	 * @see #getAwardGroup()
	 * @generated
	 */
	void setAwardGroup(AwardGroupType value);

	/**
	 * Returns the value of the '<em><b>Award Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Award Identifier</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Award Id</em>' containment reference.
	 * @see #setAwardId(AwardIdType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_AwardId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='award-id' namespace='##targetNamespace'"
	 * @generated
	 */
	AwardIdType getAwardId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getAwardId <em>Award Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Award Id</em>' containment reference.
	 * @see #getAwardId()
	 * @generated
	 */
	void setAwardId(AwardIdType value);

	/**
	 * Returns the value of the '<em><b>Back</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Back Matter</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Back</em>' containment reference.
	 * @see #setBack(BackType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Back()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='back' namespace='##targetNamespace'"
	 * @generated
	 */
	BackType getBack();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getBack <em>Back</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Back</em>' containment reference.
	 * @see #getBack()
	 * @generated
	 */
	void setBack(BackType value);

	/**
	 * Returns the value of the '<em><b>Bio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Biography</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bio</em>' containment reference.
	 * @see #setBio(BioType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Bio()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bio' namespace='##targetNamespace'"
	 * @generated
	 */
	BioType getBio();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getBio <em>Bio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bio</em>' containment reference.
	 * @see #getBio()
	 * @generated
	 */
	void setBio(BioType value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Body of the Article</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(BodyType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Body()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='body' namespace='##targetNamespace'"
	 * @generated
	 */
	BodyType getBody();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(BodyType value);

	/**
	 * Returns the value of the '<em><b>Bold</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Bold</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bold</em>' containment reference.
	 * @see #setBold(BoldType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Bold()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bold' namespace='##targetNamespace'"
	 * @generated
	 */
	BoldType getBold();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getBold <em>Bold</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bold</em>' containment reference.
	 * @see #getBold()
	 * @generated
	 */
	void setBold(BoldType value);

	/**
	 * Returns the value of the '<em><b>Boxed Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Boxed Text</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boxed Text</em>' containment reference.
	 * @see #setBoxedText(BoxedTextType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_BoxedText()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='boxed-text' namespace='##targetNamespace'"
	 * @generated
	 */
	BoxedTextType getBoxedText();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getBoxedText <em>Boxed Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boxed Text</em>' containment reference.
	 * @see #getBoxedText()
	 * @generated
	 */
	void setBoxedText(BoxedTextType value);

	/**
	 * Returns the value of the '<em><b>Break</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Line Break</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Break</em>' containment reference.
	 * @see #setBreak(BreakType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Break()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='break' namespace='##targetNamespace'"
	 * @generated
	 */
	BreakType getBreak();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getBreak <em>Break</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Break</em>' containment reference.
	 * @see #getBreak()
	 * @generated
	 */
	void setBreak(BreakType value);

	/**
	 * Returns the value of the '<em><b>Caption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Caption of a Figure, Table, Etc.</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Caption</em>' containment reference.
	 * @see #setCaption(CaptionType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Caption()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='caption' namespace='##targetNamespace'"
	 * @generated
	 */
	CaptionType getCaption();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCaption <em>Caption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption</em>' containment reference.
	 * @see #getCaption()
	 * @generated
	 */
	void setCaption(CaptionType value);

	/**
	 * Returns the value of the '<em><b>Chapter Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Chapter Title in a Citation</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chapter Title</em>' containment reference.
	 * @see #setChapterTitle(ChapterTitleType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ChapterTitle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='chapter-title' namespace='##targetNamespace'"
	 * @generated
	 */
	ChapterTitleType getChapterTitle();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getChapterTitle <em>Chapter Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chapter Title</em>' containment reference.
	 * @see #getChapterTitle()
	 * @generated
	 */
	void setChapterTitle(ChapterTitleType value);

	/**
	 * Returns the value of the '<em><b>Chem Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Chemical Structure (Display)</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chem Struct</em>' containment reference.
	 * @see #setChemStruct(ChemStructType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ChemStruct()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='chem-struct' namespace='##targetNamespace'"
	 * @generated
	 */
	ChemStructType getChemStruct();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getChemStruct <em>Chem Struct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chem Struct</em>' containment reference.
	 * @see #getChemStruct()
	 * @generated
	 */
	void setChemStruct(ChemStructType value);

	/**
	 * Returns the value of the '<em><b>Chem Struct Wrap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Chemical Structure Wrapper</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chem Struct Wrap</em>' containment reference.
	 * @see #setChemStructWrap(ChemStructWrapType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ChemStructWrap()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='chem-struct-wrap' namespace='##targetNamespace'"
	 * @generated
	 */
	ChemStructWrapType getChemStructWrap();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getChemStructWrap <em>Chem Struct Wrap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chem Struct Wrap</em>' containment reference.
	 * @see #getChemStructWrap()
	 * @generated
	 */
	void setChemStructWrap(ChemStructWrapType value);

	/**
	 * Returns the value of the '<em><b>Citation Alternatives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Citation Alternatives</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Citation Alternatives</em>' containment reference.
	 * @see #setCitationAlternatives(CitationAlternativesType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_CitationAlternatives()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='citation-alternatives' namespace='##targetNamespace'"
	 * @generated
	 */
	CitationAlternativesType getCitationAlternatives();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCitationAlternatives <em>Citation Alternatives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citation Alternatives</em>' containment reference.
	 * @see #getCitationAlternatives()
	 * @generated
	 */
	void setCitationAlternatives(CitationAlternativesType value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>City: in an Address</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>City</em>' containment reference.
	 * @see #setCity(CityType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_City()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='city' namespace='##targetNamespace'"
	 * @generated
	 */
	CityType getCity();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCity <em>City</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' containment reference.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(CityType value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Code Text</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Code()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getCode();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeType value);

	/**
	 * Returns the value of the '<em><b>Col</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Col</em>' containment reference.
	 * @see #setCol(ColType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Col()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='col' namespace='##targetNamespace'"
	 * @generated
	 */
	ColType getCol();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCol <em>Col</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col</em>' containment reference.
	 * @see #getCol()
	 * @generated
	 */
	void setCol(ColType value);

	/**
	 * Returns the value of the '<em><b>Colgroup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Colgroup</em>' containment reference.
	 * @see #setColgroup(ColgroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Colgroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='colgroup' namespace='##targetNamespace'"
	 * @generated
	 */
	ColgroupType getColgroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getColgroup <em>Colgroup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colgroup</em>' containment reference.
	 * @see #getColgroup()
	 * @generated
	 */
	void setColgroup(ColgroupType value);

	/**
	 * Returns the value of the '<em><b>Collab</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Collaborative (Group) Author</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collab</em>' containment reference.
	 * @see #setCollab(CollabType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Collab()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='collab' namespace='##targetNamespace'"
	 * @generated
	 */
	CollabType getCollab();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCollab <em>Collab</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collab</em>' containment reference.
	 * @see #getCollab()
	 * @generated
	 */
	void setCollab(CollabType value);

	/**
	 * Returns the value of the '<em><b>Collab Alternatives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Collaboration Alternatives</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collab Alternatives</em>' containment reference.
	 * @see #setCollabAlternatives(CollabAlternativesType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_CollabAlternatives()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='collab-alternatives' namespace='##targetNamespace'"
	 * @generated
	 */
	CollabAlternativesType getCollabAlternatives();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCollabAlternatives <em>Collab Alternatives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collab Alternatives</em>' containment reference.
	 * @see #getCollabAlternatives()
	 * @generated
	 */
	void setCollabAlternatives(CollabAlternativesType value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Comment in a Citation</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(CommentType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Comment()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	CommentType getComment();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(CommentType value);

	/**
	 * Returns the value of the '<em><b>Compound Kwd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Compound Keyword</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compound Kwd</em>' containment reference.
	 * @see #setCompoundKwd(CompoundKwdType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_CompoundKwd()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='compound-kwd' namespace='##targetNamespace'"
	 * @generated
	 */
	CompoundKwdType getCompoundKwd();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCompoundKwd <em>Compound Kwd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compound Kwd</em>' containment reference.
	 * @see #getCompoundKwd()
	 * @generated
	 */
	void setCompoundKwd(CompoundKwdType value);

	/**
	 * Returns the value of the '<em><b>Compound Kwd Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Compound Keyword Part</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compound Kwd Part</em>' containment reference.
	 * @see #setCompoundKwdPart(CompoundKwdPartType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_CompoundKwdPart()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='compound-kwd-part' namespace='##targetNamespace'"
	 * @generated
	 */
	CompoundKwdPartType getCompoundKwdPart();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCompoundKwdPart <em>Compound Kwd Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compound Kwd Part</em>' containment reference.
	 * @see #getCompoundKwdPart()
	 * @generated
	 */
	void setCompoundKwdPart(CompoundKwdPartType value);

	/**
	 * Returns the value of the '<em><b>Compound Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Compound Subject Name</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compound Subject</em>' containment reference.
	 * @see #setCompoundSubject(CompoundSubjectType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_CompoundSubject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='compound-subject' namespace='##targetNamespace'"
	 * @generated
	 */
	CompoundSubjectType getCompoundSubject();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCompoundSubject <em>Compound Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compound Subject</em>' containment reference.
	 * @see #getCompoundSubject()
	 * @generated
	 */
	void setCompoundSubject(CompoundSubjectType value);

	/**
	 * Returns the value of the '<em><b>Compound Subject Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Compound Subject Part Name</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compound Subject Part</em>' containment reference.
	 * @see #setCompoundSubjectPart(CompoundSubjectPartType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_CompoundSubjectPart()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='compound-subject-part' namespace='##targetNamespace'"
	 * @generated
	 */
	CompoundSubjectPartType getCompoundSubjectPart();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCompoundSubjectPart <em>Compound Subject Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compound Subject Part</em>' containment reference.
	 * @see #getCompoundSubjectPart()
	 * @generated
	 */
	void setCompoundSubjectPart(CompoundSubjectPartType value);

	/**
	 * Returns the value of the '<em><b>Conf Acronym</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Conference Acronym</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conf Acronym</em>' containment reference.
	 * @see #setConfAcronym(ConfAcronymType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ConfAcronym()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conf-acronym' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfAcronymType getConfAcronym();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getConfAcronym <em>Conf Acronym</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Acronym</em>' containment reference.
	 * @see #getConfAcronym()
	 * @generated
	 */
	void setConfAcronym(ConfAcronymType value);

	/**
	 * Returns the value of the '<em><b>Conf Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Conference Date</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conf Date</em>' containment reference.
	 * @see #setConfDate(ConfDateType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ConfDate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conf-date' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfDateType getConfDate();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getConfDate <em>Conf Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Date</em>' containment reference.
	 * @see #getConfDate()
	 * @generated
	 */
	void setConfDate(ConfDateType value);

	/**
	 * Returns the value of the '<em><b>Conf Loc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Conference Location</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conf Loc</em>' containment reference.
	 * @see #setConfLoc(ConfLocType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ConfLoc()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conf-loc' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfLocType getConfLoc();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getConfLoc <em>Conf Loc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Loc</em>' containment reference.
	 * @see #getConfLoc()
	 * @generated
	 */
	void setConfLoc(ConfLocType value);

	/**
	 * Returns the value of the '<em><b>Conf Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Conference Name</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conf Name</em>' containment reference.
	 * @see #setConfName(ConfNameType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ConfName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conf-name' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfNameType getConfName();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getConfName <em>Conf Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Name</em>' containment reference.
	 * @see #getConfName()
	 * @generated
	 */
	void setConfName(ConfNameType value);

	/**
	 * Returns the value of the '<em><b>Conf Num</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Conference Number</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conf Num</em>' containment reference.
	 * @see #setConfNum(ConfNumType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ConfNum()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conf-num' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfNumType getConfNum();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getConfNum <em>Conf Num</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Num</em>' containment reference.
	 * @see #getConfNum()
	 * @generated
	 */
	void setConfNum(ConfNumType value);

	/**
	 * Returns the value of the '<em><b>Conf Sponsor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Conference Sponsor</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conf Sponsor</em>' containment reference.
	 * @see #setConfSponsor(ConfSponsorType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ConfSponsor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conf-sponsor' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfSponsorType getConfSponsor();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getConfSponsor <em>Conf Sponsor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Sponsor</em>' containment reference.
	 * @see #getConfSponsor()
	 * @generated
	 */
	void setConfSponsor(ConfSponsorType value);

	/**
	 * Returns the value of the '<em><b>Conf Theme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Conference Theme</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conf Theme</em>' containment reference.
	 * @see #setConfTheme(ConfThemeType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ConfTheme()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conf-theme' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfThemeType getConfTheme();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getConfTheme <em>Conf Theme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Theme</em>' containment reference.
	 * @see #getConfTheme()
	 * @generated
	 */
	void setConfTheme(ConfThemeType value);

	/**
	 * Returns the value of the '<em><b>Conference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Conference Information</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conference</em>' containment reference.
	 * @see #setConference(ConferenceType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Conference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conference' namespace='##targetNamespace'"
	 * @generated
	 */
	ConferenceType getConference();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getConference <em>Conference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conference</em>' containment reference.
	 * @see #getConference()
	 * @generated
	 */
	void setConference(ConferenceType value);

	/**
	 * Returns the value of the '<em><b>Contrib</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Contributor</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contrib</em>' containment reference.
	 * @see #setContrib(ContribType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Contrib()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contrib' namespace='##targetNamespace'"
	 * @generated
	 */
	ContribType getContrib();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getContrib <em>Contrib</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contrib</em>' containment reference.
	 * @see #getContrib()
	 * @generated
	 */
	void setContrib(ContribType value);

	/**
	 * Returns the value of the '<em><b>Contrib Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Contributor Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contrib Group</em>' containment reference.
	 * @see #setContribGroup(ContribGroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ContribGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contrib-group' namespace='##targetNamespace'"
	 * @generated
	 */
	ContribGroupType getContribGroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getContribGroup <em>Contrib Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contrib Group</em>' containment reference.
	 * @see #getContribGroup()
	 * @generated
	 */
	void setContribGroup(ContribGroupType value);

	/**
	 * Returns the value of the '<em><b>Contrib Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Contributor Identifier</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contrib Id</em>' containment reference.
	 * @see #setContribId(ContribIdType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ContribId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contrib-id' namespace='##targetNamespace'"
	 * @generated
	 */
	ContribIdType getContribId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getContribId <em>Contrib Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contrib Id</em>' containment reference.
	 * @see #getContribId()
	 * @generated
	 */
	void setContribId(ContribIdType value);

	/**
	 * Returns the value of the '<em><b>Contributed Resource Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Contributed Resource Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contributed Resource Group</em>' containment reference.
	 * @see #setContributedResourceGroup(ContributedResourceGroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ContributedResourceGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contributed-resource-group' namespace='##targetNamespace'"
	 * @generated
	 */
	ContributedResourceGroupType getContributedResourceGroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getContributedResourceGroup <em>Contributed Resource Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributed Resource Group</em>' containment reference.
	 * @see #getContributedResourceGroup()
	 * @generated
	 */
	void setContributedResourceGroup(ContributedResourceGroupType value);

	/**
	 * Returns the value of the '<em><b>Copyright Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Copyright Holder</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright Holder</em>' containment reference.
	 * @see #setCopyrightHolder(CopyrightHolderType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_CopyrightHolder()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='copyright-holder' namespace='##targetNamespace'"
	 * @generated
	 */
	CopyrightHolderType getCopyrightHolder();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCopyrightHolder <em>Copyright Holder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright Holder</em>' containment reference.
	 * @see #getCopyrightHolder()
	 * @generated
	 */
	void setCopyrightHolder(CopyrightHolderType value);

	/**
	 * Returns the value of the '<em><b>Copyright Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Copyright Statement</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright Statement</em>' containment reference.
	 * @see #setCopyrightStatement(CopyrightStatementType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_CopyrightStatement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='copyright-statement' namespace='##targetNamespace'"
	 * @generated
	 */
	CopyrightStatementType getCopyrightStatement();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCopyrightStatement <em>Copyright Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright Statement</em>' containment reference.
	 * @see #getCopyrightStatement()
	 * @generated
	 */
	void setCopyrightStatement(CopyrightStatementType value);

	/**
	 * Returns the value of the '<em><b>Copyright Year</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Copyright Year</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright Year</em>' containment reference.
	 * @see #setCopyrightYear(CopyrightYearType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_CopyrightYear()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='copyright-year' namespace='##targetNamespace'"
	 * @generated
	 */
	CopyrightYearType getCopyrightYear();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCopyrightYear <em>Copyright Year</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright Year</em>' containment reference.
	 * @see #getCopyrightYear()
	 * @generated
	 */
	void setCopyrightYear(CopyrightYearType value);

	/**
	 * Returns the value of the '<em><b>Corresp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Correspondence Information</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Corresp</em>' containment reference.
	 * @see #setCorresp(CorrespType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Corresp()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='corresp' namespace='##targetNamespace'"
	 * @generated
	 */
	CorrespType getCorresp();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCorresp <em>Corresp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresp</em>' containment reference.
	 * @see #getCorresp()
	 * @generated
	 */
	void setCorresp(CorrespType value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Count</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' containment reference.
	 * @see #setCount(CountType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Count()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='count' namespace='##targetNamespace'"
	 * @generated
	 */
	CountType getCount();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCount <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' containment reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(CountType value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Country: in an Address</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country</em>' containment reference.
	 * @see #setCountry(CountryType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Country()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='country' namespace='##targetNamespace'"
	 * @generated
	 */
	CountryType getCountry();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCountry <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' containment reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(CountryType value);

	/**
	 * Returns the value of the '<em><b>Counts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Counts</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Counts</em>' containment reference.
	 * @see #setCounts(CountsType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Counts()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='counts' namespace='##targetNamespace'"
	 * @generated
	 */
	CountsType getCounts();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCounts <em>Counts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counts</em>' containment reference.
	 * @see #getCounts()
	 * @generated
	 */
	void setCounts(CountsType value);

	/**
	 * Returns the value of the '<em><b>Custom Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Custom Metadata</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Meta</em>' containment reference.
	 * @see #setCustomMeta(CustomMetaType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_CustomMeta()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-meta' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomMetaType getCustomMeta();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCustomMeta <em>Custom Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Meta</em>' containment reference.
	 * @see #getCustomMeta()
	 * @generated
	 */
	void setCustomMeta(CustomMetaType value);

	/**
	 * Returns the value of the '<em><b>Custom Meta Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Custom Metadata Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Meta Group</em>' containment reference.
	 * @see #setCustomMetaGroup(CustomMetaGroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_CustomMetaGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-meta-group' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomMetaGroupType getCustomMetaGroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getCustomMetaGroup <em>Custom Meta Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Meta Group</em>' containment reference.
	 * @see #getCustomMetaGroup()
	 * @generated
	 */
	void setCustomMetaGroup(CustomMetaGroupType value);

	/**
	 * Returns the value of the '<em><b>Data Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Data Title in a Citation</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Title</em>' containment reference.
	 * @see #setDataTitle(DataTitleType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_DataTitle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='data-title' namespace='##targetNamespace'"
	 * @generated
	 */
	DataTitleType getDataTitle();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getDataTitle <em>Data Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Title</em>' containment reference.
	 * @see #getDataTitle()
	 * @generated
	 */
	void setDataTitle(DataTitleType value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Date</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Date()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateType getDate();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateType value);

	/**
	 * Returns the value of the '<em><b>Date In Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Date Inside Citation</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date In Citation</em>' containment reference.
	 * @see #setDateInCitation(DateInCitationType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_DateInCitation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date-in-citation' namespace='##targetNamespace'"
	 * @generated
	 */
	DateInCitationType getDateInCitation();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getDateInCitation <em>Date In Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date In Citation</em>' containment reference.
	 * @see #getDateInCitation()
	 * @generated
	 */
	void setDateInCitation(DateInCitationType value);

	/**
	 * Returns the value of the '<em><b>Day</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Day</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Day</em>' containment reference.
	 * @see #setDay(DayType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Day()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='day' namespace='##targetNamespace'"
	 * @generated
	 */
	DayType getDay();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getDay <em>Day</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' containment reference.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(DayType value);

	/**
	 * Returns the value of the '<em><b>Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Definition List: Definition</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Def</em>' containment reference.
	 * @see #setDef(DefType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Def()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='def' namespace='##targetNamespace'"
	 * @generated
	 */
	DefType getDef();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getDef <em>Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def</em>' containment reference.
	 * @see #getDef()
	 * @generated
	 */
	void setDef(DefType value);

	/**
	 * Returns the value of the '<em><b>Def Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Definition List: Definition Head</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Def Head</em>' containment reference.
	 * @see #setDefHead(DefHeadType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_DefHead()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='def-head' namespace='##targetNamespace'"
	 * @generated
	 */
	DefHeadType getDefHead();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getDefHead <em>Def Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def Head</em>' containment reference.
	 * @see #getDefHead()
	 * @generated
	 */
	void setDefHead(DefHeadType value);

	/**
	 * Returns the value of the '<em><b>Def Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Definition List: Definition Item</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Def Item</em>' containment reference.
	 * @see #setDefItem(DefItemType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_DefItem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='def-item' namespace='##targetNamespace'"
	 * @generated
	 */
	DefItemType getDefItem();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getDefItem <em>Def Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def Item</em>' containment reference.
	 * @see #getDefItem()
	 * @generated
	 */
	void setDefItem(DefItemType value);

	/**
	 * Returns the value of the '<em><b>Def List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Definition List</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Def List</em>' containment reference.
	 * @see #setDefList(DefListType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_DefList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='def-list' namespace='##targetNamespace'"
	 * @generated
	 */
	DefListType getDefList();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getDefList <em>Def List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def List</em>' containment reference.
	 * @see #getDefList()
	 * @generated
	 */
	void setDefList(DefListType value);

	/**
	 * Returns the value of the '<em><b>Degrees</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Degree(s)</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Degrees</em>' containment reference.
	 * @see #setDegrees(DegreesType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Degrees()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='degrees' namespace='##targetNamespace'"
	 * @generated
	 */
	DegreesType getDegrees();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getDegrees <em>Degrees</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degrees</em>' containment reference.
	 * @see #getDegrees()
	 * @generated
	 */
	void setDegrees(DegreesType value);

	/**
	 * Returns the value of the '<em><b>Disp Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Formula, Display</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disp Formula</em>' containment reference.
	 * @see #setDispFormula(DispFormulaType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_DispFormula()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='disp-formula' namespace='##targetNamespace'"
	 * @generated
	 */
	DispFormulaType getDispFormula();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getDispFormula <em>Disp Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disp Formula</em>' containment reference.
	 * @see #getDispFormula()
	 * @generated
	 */
	void setDispFormula(DispFormulaType value);

	/**
	 * Returns the value of the '<em><b>Disp Formula Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Formula, Display Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disp Formula Group</em>' containment reference.
	 * @see #setDispFormulaGroup(DispFormulaGroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_DispFormulaGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='disp-formula-group' namespace='##targetNamespace'"
	 * @generated
	 */
	DispFormulaGroupType getDispFormulaGroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getDispFormulaGroup <em>Disp Formula Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disp Formula Group</em>' containment reference.
	 * @see #getDispFormulaGroup()
	 * @generated
	 */
	void setDispFormulaGroup(DispFormulaGroupType value);

	/**
	 * Returns the value of the '<em><b>Disp Quote</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Quote, Displayed</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disp Quote</em>' containment reference.
	 * @see #setDispQuote(DispQuoteType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_DispQuote()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='disp-quote' namespace='##targetNamespace'"
	 * @generated
	 */
	DispQuoteType getDispQuote();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getDispQuote <em>Disp Quote</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disp Quote</em>' containment reference.
	 * @see #getDispQuote()
	 * @generated
	 */
	void setDispQuote(DispQuoteType value);

	/**
	 * Returns the value of the '<em><b>Edition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Edition Statement, Cited</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edition</em>' containment reference.
	 * @see #setEdition(EditionType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Edition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='edition' namespace='##targetNamespace'"
	 * @generated
	 */
	EditionType getEdition();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getEdition <em>Edition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edition</em>' containment reference.
	 * @see #getEdition()
	 * @generated
	 */
	void setEdition(EditionType value);

	/**
	 * Returns the value of the '<em><b>Element Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Element Citation</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Citation</em>' containment reference.
	 * @see #setElementCitation(ElementCitationType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ElementCitation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='element-citation' namespace='##targetNamespace'"
	 * @generated
	 */
	ElementCitationType getElementCitation();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getElementCitation <em>Element Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Citation</em>' containment reference.
	 * @see #getElementCitation()
	 * @generated
	 */
	void setElementCitation(ElementCitationType value);

	/**
	 * Returns the value of the '<em><b>Elocation Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Electronic Location Identifier</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elocation Id</em>' containment reference.
	 * @see #setElocationId(ElocationIdType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ElocationId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='elocation-id' namespace='##targetNamespace'"
	 * @generated
	 */
	ElocationIdType getElocationId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getElocationId <em>Elocation Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elocation Id</em>' containment reference.
	 * @see #getElocationId()
	 * @generated
	 */
	void setElocationId(ElocationIdType value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Email Address</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Email</em>' containment reference.
	 * @see #setEmail(EmailType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Email()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='email' namespace='##targetNamespace'"
	 * @generated
	 */
	EmailType getEmail();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getEmail <em>Email</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' containment reference.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(EmailType value);

	/**
	 * Returns the value of the '<em><b>Equation Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Equation Count</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Equation Count</em>' containment reference.
	 * @see #setEquationCount(EquationCountType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_EquationCount()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='equation-count' namespace='##targetNamespace'"
	 * @generated
	 */
	EquationCountType getEquationCount();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getEquationCount <em>Equation Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equation Count</em>' containment reference.
	 * @see #getEquationCount()
	 * @generated
	 */
	void setEquationCount(EquationCountType value);

	/**
	 * Returns the value of the '<em><b>Era</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Era</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Era</em>' containment reference.
	 * @see #setEra(EraType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Era()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='era' namespace='##targetNamespace'"
	 * @generated
	 */
	EraType getEra();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getEra <em>Era</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Era</em>' containment reference.
	 * @see #getEra()
	 * @generated
	 */
	void setEra(EraType value);

	/**
	 * Returns the value of the '<em><b>Etal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Et Al</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Etal</em>' containment reference.
	 * @see #setEtal(EtalType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Etal()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='etal' namespace='##targetNamespace'"
	 * @generated
	 */
	EtalType getEtal();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getEtal <em>Etal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etal</em>' containment reference.
	 * @see #getEtal()
	 * @generated
	 */
	void setEtal(EtalType value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Event in Publishing History</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(EventType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Event()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='event' namespace='##targetNamespace'"
	 * @generated
	 */
	EventType getEvent();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(EventType value);

	/**
	 * Returns the value of the '<em><b>Event Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Event Description</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Desc</em>' containment reference.
	 * @see #setEventDesc(EventDescType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_EventDesc()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='event-desc' namespace='##targetNamespace'"
	 * @generated
	 */
	EventDescType getEventDesc();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getEventDesc <em>Event Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Desc</em>' containment reference.
	 * @see #getEventDesc()
	 * @generated
	 */
	void setEventDesc(EventDescType value);

	/**
	 * Returns the value of the '<em><b>Ext Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>External Link</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ext Link</em>' containment reference.
	 * @see #setExtLink(ExtLinkType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ExtLink()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ext-link' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtLinkType getExtLink();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getExtLink <em>Ext Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext Link</em>' containment reference.
	 * @see #getExtLink()
	 * @generated
	 */
	void setExtLink(ExtLinkType value);

	/**
	 * Returns the value of the '<em><b>Fax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Fax Number: in an Address</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fax</em>' containment reference.
	 * @see #setFax(FaxType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Fax()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fax' namespace='##targetNamespace'"
	 * @generated
	 */
	FaxType getFax();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFax <em>Fax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fax</em>' containment reference.
	 * @see #getFax()
	 * @generated
	 */
	void setFax(FaxType value);

	/**
	 * Returns the value of the '<em><b>Fig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Figure</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fig</em>' containment reference.
	 * @see #setFig(FigType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Fig()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fig' namespace='##targetNamespace'"
	 * @generated
	 */
	FigType getFig();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFig <em>Fig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fig</em>' containment reference.
	 * @see #getFig()
	 * @generated
	 */
	void setFig(FigType value);

	/**
	 * Returns the value of the '<em><b>Fig Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Figure Count</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fig Count</em>' containment reference.
	 * @see #setFigCount(FigCountType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_FigCount()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fig-count' namespace='##targetNamespace'"
	 * @generated
	 */
	FigCountType getFigCount();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFigCount <em>Fig Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fig Count</em>' containment reference.
	 * @see #getFigCount()
	 * @generated
	 */
	void setFigCount(FigCountType value);

	/**
	 * Returns the value of the '<em><b>Fig Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Figure Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fig Group</em>' containment reference.
	 * @see #setFigGroup(FigGroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_FigGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fig-group' namespace='##targetNamespace'"
	 * @generated
	 */
	FigGroupType getFigGroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFigGroup <em>Fig Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fig Group</em>' containment reference.
	 * @see #getFigGroup()
	 * @generated
	 */
	void setFigGroup(FigGroupType value);

	/**
	 * Returns the value of the '<em><b>Fixed Case</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Fixed Case</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Case</em>' containment reference.
	 * @see #setFixedCase(FixedCaseType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_FixedCase()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fixed-case' namespace='##targetNamespace'"
	 * @generated
	 */
	FixedCaseType getFixedCase();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFixedCase <em>Fixed Case</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Case</em>' containment reference.
	 * @see #getFixedCase()
	 * @generated
	 */
	void setFixedCase(FixedCaseType value);

	/**
	 * Returns the value of the '<em><b>Floats Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Floats Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Floats Group</em>' containment reference.
	 * @see #setFloatsGroup(FloatsGroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_FloatsGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='floats-group' namespace='##targetNamespace'"
	 * @generated
	 */
	FloatsGroupType getFloatsGroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFloatsGroup <em>Floats Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floats Group</em>' containment reference.
	 * @see #getFloatsGroup()
	 * @generated
	 */
	void setFloatsGroup(FloatsGroupType value);

	/**
	 * Returns the value of the '<em><b>Fn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Footnote</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fn</em>' containment reference.
	 * @see #setFn(FnType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Fn()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fn' namespace='##targetNamespace'"
	 * @generated
	 */
	FnType getFn();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFn <em>Fn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fn</em>' containment reference.
	 * @see #getFn()
	 * @generated
	 */
	void setFn(FnType value);

	/**
	 * Returns the value of the '<em><b>Fn Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Footnote Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fn Group</em>' containment reference.
	 * @see #setFnGroup(FnGroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_FnGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fn-group' namespace='##targetNamespace'"
	 * @generated
	 */
	FnGroupType getFnGroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFnGroup <em>Fn Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fn Group</em>' containment reference.
	 * @see #getFnGroup()
	 * @generated
	 */
	void setFnGroup(FnGroupType value);

	/**
	 * Returns the value of the '<em><b>Fpage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>First Page</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fpage</em>' containment reference.
	 * @see #setFpage(FpageType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Fpage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fpage' namespace='##targetNamespace'"
	 * @generated
	 */
	FpageType getFpage();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFpage <em>Fpage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fpage</em>' containment reference.
	 * @see #getFpage()
	 * @generated
	 */
	void setFpage(FpageType value);

	/**
	 * Returns the value of the '<em><b>Front</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Front Matter</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Front</em>' containment reference.
	 * @see #setFront(FrontType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Front()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='front' namespace='##targetNamespace'"
	 * @generated
	 */
	FrontType getFront();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFront <em>Front</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Front</em>' containment reference.
	 * @see #getFront()
	 * @generated
	 */
	void setFront(FrontType value);

	/**
	 * Returns the value of the '<em><b>Front Stub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Stub Front Metadata</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Front Stub</em>' containment reference.
	 * @see #setFrontStub(FrontStubType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_FrontStub()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='front-stub' namespace='##targetNamespace'"
	 * @generated
	 */
	FrontStubType getFrontStub();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFrontStub <em>Front Stub</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Front Stub</em>' containment reference.
	 * @see #getFrontStub()
	 * @generated
	 */
	void setFrontStub(FrontStubType value);

	/**
	 * Returns the value of the '<em><b>Funding Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Funding Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Funding Group</em>' containment reference.
	 * @see #setFundingGroup(FundingGroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_FundingGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='funding-group' namespace='##targetNamespace'"
	 * @generated
	 */
	FundingGroupType getFundingGroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFundingGroup <em>Funding Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funding Group</em>' containment reference.
	 * @see #getFundingGroup()
	 * @generated
	 */
	void setFundingGroup(FundingGroupType value);

	/**
	 * Returns the value of the '<em><b>Funding Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Funding Source</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Funding Source</em>' containment reference.
	 * @see #setFundingSource(FundingSourceType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_FundingSource()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='funding-source' namespace='##targetNamespace'"
	 * @generated
	 */
	FundingSourceType getFundingSource();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFundingSource <em>Funding Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funding Source</em>' containment reference.
	 * @see #getFundingSource()
	 * @generated
	 */
	void setFundingSource(FundingSourceType value);

	/**
	 * Returns the value of the '<em><b>Funding Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Funding Statement</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Funding Statement</em>' containment reference.
	 * @see #setFundingStatement(FundingStatementType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_FundingStatement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='funding-statement' namespace='##targetNamespace'"
	 * @generated
	 */
	FundingStatementType getFundingStatement();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getFundingStatement <em>Funding Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funding Statement</em>' containment reference.
	 * @see #getFundingStatement()
	 * @generated
	 */
	void setFundingStatement(FundingStatementType value);

	/**
	 * Returns the value of the '<em><b>Given Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Given (First) Names</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Given Names</em>' containment reference.
	 * @see #setGivenNames(GivenNamesType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_GivenNames()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='given-names' namespace='##targetNamespace'"
	 * @generated
	 */
	GivenNamesType getGivenNames();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getGivenNames <em>Given Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Given Names</em>' containment reference.
	 * @see #getGivenNames()
	 * @generated
	 */
	void setGivenNames(GivenNamesType value);

	/**
	 * Returns the value of the '<em><b>Glossary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Glossary Elements</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Glossary</em>' containment reference.
	 * @see #setGlossary(GlossaryType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Glossary()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='glossary' namespace='##targetNamespace'"
	 * @generated
	 */
	GlossaryType getGlossary();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getGlossary <em>Glossary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glossary</em>' containment reference.
	 * @see #getGlossary()
	 * @generated
	 */
	void setGlossary(GlossaryType value);

	/**
	 * Returns the value of the '<em><b>Glyph Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Glyph Data For a Private Character</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Glyph Data</em>' containment reference.
	 * @see #setGlyphData(GlyphDataType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_GlyphData()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='glyph-data' namespace='##targetNamespace'"
	 * @generated
	 */
	GlyphDataType getGlyphData();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getGlyphData <em>Glyph Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glyph Data</em>' containment reference.
	 * @see #getGlyphData()
	 * @generated
	 */
	void setGlyphData(GlyphDataType value);

	/**
	 * Returns the value of the '<em><b>Glyph Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Glyph Reference For a Private Character</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Glyph Ref</em>' containment reference.
	 * @see #setGlyphRef(GlyphRefType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_GlyphRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='glyph-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	GlyphRefType getGlyphRef();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getGlyphRef <em>Glyph Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glyph Ref</em>' containment reference.
	 * @see #getGlyphRef()
	 * @generated
	 */
	void setGlyphRef(GlyphRefType value);

	/**
	 * Returns the value of the '<em><b>Gov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Government Report, Cited</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gov</em>' containment reference.
	 * @see #setGov(GovType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Gov()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='gov' namespace='##targetNamespace'"
	 * @generated
	 */
	GovType getGov();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getGov <em>Gov</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gov</em>' containment reference.
	 * @see #getGov()
	 * @generated
	 */
	void setGov(GovType value);

	/**
	 * Returns the value of the '<em><b>Graphic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Graphic</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graphic</em>' containment reference.
	 * @see #setGraphic(GraphicType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Graphic()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='graphic' namespace='##targetNamespace'"
	 * @generated
	 */
	GraphicType getGraphic();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getGraphic <em>Graphic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphic</em>' containment reference.
	 * @see #getGraphic()
	 * @generated
	 */
	void setGraphic(GraphicType value);

	/**
	 * Returns the value of the '<em><b>History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>History: Document History</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>History</em>' containment reference.
	 * @see #setHistory(HistoryType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_History()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='history' namespace='##targetNamespace'"
	 * @generated
	 */
	HistoryType getHistory();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getHistory <em>History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History</em>' containment reference.
	 * @see #getHistory()
	 * @generated
	 */
	void setHistory(HistoryType value);

	/**
	 * Returns the value of the '<em><b>Hr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Horizontal Rule</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hr</em>' containment reference.
	 * @see #setHr(HrType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Hr()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hr' namespace='##targetNamespace'"
	 * @generated
	 */
	HrType getHr();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getHr <em>Hr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hr</em>' containment reference.
	 * @see #getHr()
	 * @generated
	 */
	void setHr(HrType value);

	/**
	 * Returns the value of the '<em><b>Index Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Index Term</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Index Term</em>' containment reference.
	 * @see #setIndexTerm(IndexTermType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_IndexTerm()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='index-term' namespace='##targetNamespace'"
	 * @generated
	 */
	IndexTermType getIndexTerm();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getIndexTerm <em>Index Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Term</em>' containment reference.
	 * @see #getIndexTerm()
	 * @generated
	 */
	void setIndexTerm(IndexTermType value);

	/**
	 * Returns the value of the '<em><b>Index Term Range End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Index Term Range End</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Index Term Range End</em>' containment reference.
	 * @see #setIndexTermRangeEnd(IndexTermRangeEndType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_IndexTermRangeEnd()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='index-term-range-end' namespace='##targetNamespace'"
	 * @generated
	 */
	IndexTermRangeEndType getIndexTermRangeEnd();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getIndexTermRangeEnd <em>Index Term Range End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Term Range End</em>' containment reference.
	 * @see #getIndexTermRangeEnd()
	 * @generated
	 */
	void setIndexTermRangeEnd(IndexTermRangeEndType value);

	/**
	 * Returns the value of the '<em><b>Inline Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Formula, Inline</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inline Formula</em>' containment reference.
	 * @see #setInlineFormula(InlineFormulaType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_InlineFormula()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inline-formula' namespace='##targetNamespace'"
	 * @generated
	 */
	InlineFormulaType getInlineFormula();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getInlineFormula <em>Inline Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inline Formula</em>' containment reference.
	 * @see #getInlineFormula()
	 * @generated
	 */
	void setInlineFormula(InlineFormulaType value);

	/**
	 * Returns the value of the '<em><b>Inline Graphic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Inline Graphic</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inline Graphic</em>' containment reference.
	 * @see #setInlineGraphic(InlineGraphicType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_InlineGraphic()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inline-graphic' namespace='##targetNamespace'"
	 * @generated
	 */
	InlineGraphicType getInlineGraphic();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getInlineGraphic <em>Inline Graphic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inline Graphic</em>' containment reference.
	 * @see #getInlineGraphic()
	 * @generated
	 */
	void setInlineGraphic(InlineGraphicType value);

	/**
	 * Returns the value of the '<em><b>Inline Media</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Inline Media Object</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inline Media</em>' containment reference.
	 * @see #setInlineMedia(InlineMediaType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_InlineMedia()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inline-media' namespace='##targetNamespace'"
	 * @generated
	 */
	InlineMediaType getInlineMedia();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getInlineMedia <em>Inline Media</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inline Media</em>' containment reference.
	 * @see #getInlineMedia()
	 * @generated
	 */
	void setInlineMedia(InlineMediaType value);

	/**
	 * Returns the value of the '<em><b>Inline Supplementary Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Inline Supplementary Material</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inline Supplementary Material</em>' containment reference.
	 * @see #setInlineSupplementaryMaterial(InlineSupplementaryMaterialType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_InlineSupplementaryMaterial()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inline-supplementary-material' namespace='##targetNamespace'"
	 * @generated
	 */
	InlineSupplementaryMaterialType getInlineSupplementaryMaterial();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getInlineSupplementaryMaterial <em>Inline Supplementary Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inline Supplementary Material</em>' containment reference.
	 * @see #getInlineSupplementaryMaterial()
	 * @generated
	 */
	void setInlineSupplementaryMaterial(InlineSupplementaryMaterialType value);

	/**
	 * Returns the value of the '<em><b>Institution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Institution Name: in an Address</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Institution</em>' containment reference.
	 * @see #setInstitution(InstitutionType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Institution()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='institution' namespace='##targetNamespace'"
	 * @generated
	 */
	InstitutionType getInstitution();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getInstitution <em>Institution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution</em>' containment reference.
	 * @see #getInstitution()
	 * @generated
	 */
	void setInstitution(InstitutionType value);

	/**
	 * Returns the value of the '<em><b>Institution Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Institution Identifier</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Institution Id</em>' containment reference.
	 * @see #setInstitutionId(InstitutionIdType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_InstitutionId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='institution-id' namespace='##targetNamespace'"
	 * @generated
	 */
	InstitutionIdType getInstitutionId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getInstitutionId <em>Institution Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution Id</em>' containment reference.
	 * @see #getInstitutionId()
	 * @generated
	 */
	void setInstitutionId(InstitutionIdType value);

	/**
	 * Returns the value of the '<em><b>Institution Wrap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Institution Wrapper</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Institution Wrap</em>' containment reference.
	 * @see #setInstitutionWrap(InstitutionWrapType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_InstitutionWrap()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='institution-wrap' namespace='##targetNamespace'"
	 * @generated
	 */
	InstitutionWrapType getInstitutionWrap();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getInstitutionWrap <em>Institution Wrap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution Wrap</em>' containment reference.
	 * @see #getInstitutionWrap()
	 * @generated
	 */
	void setInstitutionWrap(InstitutionWrapType value);

	/**
	 * Returns the value of the '<em><b>Isbn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Isbn</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Isbn</em>' containment reference.
	 * @see #setIsbn(IsbnType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Isbn()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='isbn' namespace='##targetNamespace'"
	 * @generated
	 */
	IsbnType getIsbn();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getIsbn <em>Isbn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isbn</em>' containment reference.
	 * @see #getIsbn()
	 * @generated
	 */
	void setIsbn(IsbnType value);

	/**
	 * Returns the value of the '<em><b>Issn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Issn</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issn</em>' containment reference.
	 * @see #setIssn(IssnType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Issn()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issn' namespace='##targetNamespace'"
	 * @generated
	 */
	IssnType getIssn();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getIssn <em>Issn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issn</em>' containment reference.
	 * @see #getIssn()
	 * @generated
	 */
	void setIssn(IssnType value);

	/**
	 * Returns the value of the '<em><b>Issn L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Issn Linking</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issn L</em>' containment reference.
	 * @see #setIssnL(IssnLType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_IssnL()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issn-l' namespace='##targetNamespace'"
	 * @generated
	 */
	IssnLType getIssnL();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getIssnL <em>Issn L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issn L</em>' containment reference.
	 * @see #getIssnL()
	 * @generated
	 */
	void setIssnL(IssnLType value);

	/**
	 * Returns the value of the '<em><b>Issue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Issue Number</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue</em>' containment reference.
	 * @see #setIssue(IssueType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Issue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issue' namespace='##targetNamespace'"
	 * @generated
	 */
	IssueType getIssue();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getIssue <em>Issue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue</em>' containment reference.
	 * @see #getIssue()
	 * @generated
	 */
	void setIssue(IssueType value);

	/**
	 * Returns the value of the '<em><b>Issue Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Issue Identifier</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Id</em>' containment reference.
	 * @see #setIssueId(IssueIdType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_IssueId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issue-id' namespace='##targetNamespace'"
	 * @generated
	 */
	IssueIdType getIssueId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getIssueId <em>Issue Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Id</em>' containment reference.
	 * @see #getIssueId()
	 * @generated
	 */
	void setIssueId(IssueIdType value);

	/**
	 * Returns the value of the '<em><b>Issue Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Issue Part</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Part</em>' containment reference.
	 * @see #setIssuePart(IssuePartType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_IssuePart()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issue-part' namespace='##targetNamespace'"
	 * @generated
	 */
	IssuePartType getIssuePart();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getIssuePart <em>Issue Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Part</em>' containment reference.
	 * @see #getIssuePart()
	 * @generated
	 */
	void setIssuePart(IssuePartType value);

	/**
	 * Returns the value of the '<em><b>Issue Sponsor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Issue Title</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Sponsor</em>' containment reference.
	 * @see #setIssueSponsor(IssueSponsorType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_IssueSponsor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issue-sponsor' namespace='##targetNamespace'"
	 * @generated
	 */
	IssueSponsorType getIssueSponsor();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getIssueSponsor <em>Issue Sponsor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Sponsor</em>' containment reference.
	 * @see #getIssueSponsor()
	 * @generated
	 */
	void setIssueSponsor(IssueSponsorType value);

	/**
	 * Returns the value of the '<em><b>Issue Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Issue Title</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Title</em>' containment reference.
	 * @see #setIssueTitle(IssueTitleType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_IssueTitle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issue-title' namespace='##targetNamespace'"
	 * @generated
	 */
	IssueTitleType getIssueTitle();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getIssueTitle <em>Issue Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Title</em>' containment reference.
	 * @see #getIssueTitle()
	 * @generated
	 */
	void setIssueTitle(IssueTitleType value);

	/**
	 * Returns the value of the '<em><b>Italic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Italic</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Italic</em>' containment reference.
	 * @see #setItalic(ItalicType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Italic()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='italic' namespace='##targetNamespace'"
	 * @generated
	 */
	ItalicType getItalic();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getItalic <em>Italic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Italic</em>' containment reference.
	 * @see #getItalic()
	 * @generated
	 */
	void setItalic(ItalicType value);

	/**
	 * Returns the value of the '<em><b>Journal Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Journal Identifier</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journal Id</em>' containment reference.
	 * @see #setJournalId(JournalIdType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_JournalId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='journal-id' namespace='##targetNamespace'"
	 * @generated
	 */
	JournalIdType getJournalId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getJournalId <em>Journal Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journal Id</em>' containment reference.
	 * @see #getJournalId()
	 * @generated
	 */
	void setJournalId(JournalIdType value);

	/**
	 * Returns the value of the '<em><b>Journal Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Journal Metadata</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journal Meta</em>' containment reference.
	 * @see #setJournalMeta(JournalMetaType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_JournalMeta()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='journal-meta' namespace='##targetNamespace'"
	 * @generated
	 */
	JournalMetaType getJournalMeta();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getJournalMeta <em>Journal Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journal Meta</em>' containment reference.
	 * @see #getJournalMeta()
	 * @generated
	 */
	void setJournalMeta(JournalMetaType value);

	/**
	 * Returns the value of the '<em><b>Journal Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Journal Subtitle</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journal Subtitle</em>' containment reference.
	 * @see #setJournalSubtitle(JournalSubtitleType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_JournalSubtitle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='journal-subtitle' namespace='##targetNamespace'"
	 * @generated
	 */
	JournalSubtitleType getJournalSubtitle();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getJournalSubtitle <em>Journal Subtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journal Subtitle</em>' containment reference.
	 * @see #getJournalSubtitle()
	 * @generated
	 */
	void setJournalSubtitle(JournalSubtitleType value);

	/**
	 * Returns the value of the '<em><b>Journal Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Journal Title (Full)</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journal Title</em>' containment reference.
	 * @see #setJournalTitle(JournalTitleType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_JournalTitle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='journal-title' namespace='##targetNamespace'"
	 * @generated
	 */
	JournalTitleType getJournalTitle();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getJournalTitle <em>Journal Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journal Title</em>' containment reference.
	 * @see #getJournalTitle()
	 * @generated
	 */
	void setJournalTitle(JournalTitleType value);

	/**
	 * Returns the value of the '<em><b>Journal Title Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Journal Title Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journal Title Group</em>' containment reference.
	 * @see #setJournalTitleGroup(JournalTitleGroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_JournalTitleGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='journal-title-group' namespace='##targetNamespace'"
	 * @generated
	 */
	JournalTitleGroupType getJournalTitleGroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getJournalTitleGroup <em>Journal Title Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journal Title Group</em>' containment reference.
	 * @see #getJournalTitleGroup()
	 * @generated
	 */
	void setJournalTitleGroup(JournalTitleGroupType value);

	/**
	 * Returns the value of the '<em><b>Kwd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Keyword</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kwd</em>' containment reference.
	 * @see #setKwd(KwdType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Kwd()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='kwd' namespace='##targetNamespace'"
	 * @generated
	 */
	KwdType getKwd();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getKwd <em>Kwd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kwd</em>' containment reference.
	 * @see #getKwd()
	 * @generated
	 */
	void setKwd(KwdType value);

	/**
	 * Returns the value of the '<em><b>Kwd Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Keyword Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kwd Group</em>' containment reference.
	 * @see #setKwdGroup(KwdGroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_KwdGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='kwd-group' namespace='##targetNamespace'"
	 * @generated
	 */
	KwdGroupType getKwdGroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getKwdGroup <em>Kwd Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kwd Group</em>' containment reference.
	 * @see #getKwdGroup()
	 * @generated
	 */
	void setKwdGroup(KwdGroupType value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Label of a Figure, Reference, Etc.</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(LabelType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Label()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	LabelType getLabel();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(LabelType value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>License Information</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>License</em>' containment reference.
	 * @see #setLicense(LicenseType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_License()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='license' namespace='##targetNamespace'"
	 * @generated
	 */
	LicenseType getLicense();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getLicense <em>License</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' containment reference.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(LicenseType value);

	/**
	 * Returns the value of the '<em><b>License P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>License Paragraph</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>License P</em>' containment reference.
	 * @see #setLicenseP(LicensePType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_LicenseP()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='license-p' namespace='##targetNamespace'"
	 * @generated
	 */
	LicensePType getLicenseP();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getLicenseP <em>License P</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License P</em>' containment reference.
	 * @see #getLicenseP()
	 * @generated
	 */
	void setLicenseP(LicensePType value);

	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>List</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List</em>' containment reference.
	 * @see #setList(ListType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_List()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list' namespace='##targetNamespace'"
	 * @generated
	 */
	ListType getList();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getList <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' containment reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(ListType value);

	/**
	 * Returns the value of the '<em><b>List Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>List Item</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List Item</em>' containment reference.
	 * @see #setListItem(ListItemType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ListItem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list-item' namespace='##targetNamespace'"
	 * @generated
	 */
	ListItemType getListItem();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getListItem <em>List Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Item</em>' containment reference.
	 * @see #getListItem()
	 * @generated
	 */
	void setListItem(ListItemType value);

	/**
	 * Returns the value of the '<em><b>Long Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Long Description</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Long Desc</em>' containment reference.
	 * @see #setLongDesc(LongDescType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_LongDesc()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='long-desc' namespace='##targetNamespace'"
	 * @generated
	 */
	LongDescType getLongDesc();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getLongDesc <em>Long Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Desc</em>' containment reference.
	 * @see #getLongDesc()
	 * @generated
	 */
	void setLongDesc(LongDescType value);

	/**
	 * Returns the value of the '<em><b>Lpage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Last Page</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lpage</em>' containment reference.
	 * @see #setLpage(LpageType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Lpage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lpage' namespace='##targetNamespace'"
	 * @generated
	 */
	LpageType getLpage();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getLpage <em>Lpage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lpage</em>' containment reference.
	 * @see #getLpage()
	 * @generated
	 */
	void setLpage(LpageType value);

	/**
	 * Returns the value of the '<em><b>Media</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Media Object</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media</em>' containment reference.
	 * @see #setMedia(MediaType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Media()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='media' namespace='##targetNamespace'"
	 * @generated
	 */
	MediaType getMedia();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getMedia <em>Media</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media</em>' containment reference.
	 * @see #getMedia()
	 * @generated
	 */
	void setMedia(MediaType value);

	/**
	 * Returns the value of the '<em><b>Meta Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Metadata Data Name For Custom Metadata</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meta Name</em>' containment reference.
	 * @see #setMetaName(MetaNameType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_MetaName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='meta-name' namespace='##targetNamespace'"
	 * @generated
	 */
	MetaNameType getMetaName();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getMetaName <em>Meta Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Name</em>' containment reference.
	 * @see #getMetaName()
	 * @generated
	 */
	void setMetaName(MetaNameType value);

	/**
	 * Returns the value of the '<em><b>Meta Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Metadata Data Value For Custom Metadata</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meta Value</em>' containment reference.
	 * @see #setMetaValue(MetaValueType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_MetaValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='meta-value' namespace='##targetNamespace'"
	 * @generated
	 */
	MetaValueType getMetaValue();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getMetaValue <em>Meta Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Value</em>' containment reference.
	 * @see #getMetaValue()
	 * @generated
	 */
	void setMetaValue(MetaValueType value);

	/**
	 * Returns the value of the '<em><b>Milestone End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Milestone End</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Milestone End</em>' containment reference.
	 * @see #setMilestoneEnd(MilestoneEndType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_MilestoneEnd()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='milestone-end' namespace='##targetNamespace'"
	 * @generated
	 */
	MilestoneEndType getMilestoneEnd();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getMilestoneEnd <em>Milestone End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Milestone End</em>' containment reference.
	 * @see #getMilestoneEnd()
	 * @generated
	 */
	void setMilestoneEnd(MilestoneEndType value);

	/**
	 * Returns the value of the '<em><b>Milestone Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Milestone Start</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Milestone Start</em>' containment reference.
	 * @see #setMilestoneStart(MilestoneStartType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_MilestoneStart()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='milestone-start' namespace='##targetNamespace'"
	 * @generated
	 */
	MilestoneStartType getMilestoneStart();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getMilestoneStart <em>Milestone Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Milestone Start</em>' containment reference.
	 * @see #getMilestoneStart()
	 * @generated
	 */
	void setMilestoneStart(MilestoneStartType value);

	/**
	 * Returns the value of the '<em><b>Mixed Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Mixed Citation</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mixed Citation</em>' containment reference.
	 * @see #setMixedCitation(MixedCitationType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_MixedCitation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mixed-citation' namespace='##targetNamespace'"
	 * @generated
	 */
	MixedCitationType getMixedCitation();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getMixedCitation <em>Mixed Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mixed Citation</em>' containment reference.
	 * @see #getMixedCitation()
	 * @generated
	 */
	void setMixedCitation(MixedCitationType value);

	/**
	 * Returns the value of the '<em><b>Monospace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Monospace Text (Typewriter Text)</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monospace</em>' containment reference.
	 * @see #setMonospace(MonospaceType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Monospace()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='monospace' namespace='##targetNamespace'"
	 * @generated
	 */
	MonospaceType getMonospace();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getMonospace <em>Monospace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monospace</em>' containment reference.
	 * @see #getMonospace()
	 * @generated
	 */
	void setMonospace(MonospaceType value);

	/**
	 * Returns the value of the '<em><b>Month</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Month</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Month</em>' containment reference.
	 * @see #setMonth(MonthType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Month()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='month' namespace='##targetNamespace'"
	 * @generated
	 */
	MonthType getMonth();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getMonth <em>Month</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month</em>' containment reference.
	 * @see #getMonth()
	 * @generated
	 */
	void setMonth(MonthType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Name of Person (Structured)</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Name()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	NameType getName();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameType value);

	/**
	 * Returns the value of the '<em><b>Name Alternatives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Name Alternatives</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Alternatives</em>' containment reference.
	 * @see #setNameAlternatives(NameAlternativesType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_NameAlternatives()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='name-alternatives' namespace='##targetNamespace'"
	 * @generated
	 */
	NameAlternativesType getNameAlternatives();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getNameAlternatives <em>Name Alternatives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Alternatives</em>' containment reference.
	 * @see #getNameAlternatives()
	 * @generated
	 */
	void setNameAlternatives(NameAlternativesType value);

	/**
	 * Returns the value of the '<em><b>Named Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Named Special (Subject) Content</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Named Content</em>' containment reference.
	 * @see #setNamedContent(NamedContentType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_NamedContent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='named-content' namespace='##targetNamespace'"
	 * @generated
	 */
	NamedContentType getNamedContent();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getNamedContent <em>Named Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Named Content</em>' containment reference.
	 * @see #getNamedContent()
	 * @generated
	 */
	void setNamedContent(NamedContentType value);

	/**
	 * Returns the value of the '<em><b>Nested Kwd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Nested Keyword</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Kwd</em>' containment reference.
	 * @see #setNestedKwd(NestedKwdType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_NestedKwd()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nested-kwd' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedKwdType getNestedKwd();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getNestedKwd <em>Nested Kwd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nested Kwd</em>' containment reference.
	 * @see #getNestedKwd()
	 * @generated
	 */
	void setNestedKwd(NestedKwdType value);

	/**
	 * Returns the value of the '<em><b>Nlm Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Nlm Citation Model</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nlm Citation</em>' containment reference.
	 * @see #setNlmCitation(NlmCitationType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_NlmCitation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nlm-citation' namespace='##targetNamespace'"
	 * @generated
	 */
	NlmCitationType getNlmCitation();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getNlmCitation <em>Nlm Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nlm Citation</em>' containment reference.
	 * @see #getNlmCitation()
	 * @generated
	 */
	void setNlmCitation(NlmCitationType value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Note in a Reference List</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference.
	 * @see #setNote(NoteType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Note()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	NoteType getNote();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(NoteType value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Notes</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference.
	 * @see #setNotes(NotesType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Notes()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='notes' namespace='##targetNamespace'"
	 * @generated
	 */
	NotesType getNotes();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getNotes <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' containment reference.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(NotesType value);

	/**
	 * Returns the value of the '<em><b>Object Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Object Identifier</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Id</em>' containment reference.
	 * @see #setObjectId(ObjectIdType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ObjectId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object-id' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectIdType getObjectId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getObjectId <em>Object Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Id</em>' containment reference.
	 * @see #getObjectId()
	 * @generated
	 */
	void setObjectId(ObjectIdType value);

	/**
	 * Returns the value of the '<em><b>On Behalf Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>On Behalf of</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Behalf Of</em>' containment reference.
	 * @see #setOnBehalfOf(OnBehalfOfType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_OnBehalfOf()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='on-behalf-of' namespace='##targetNamespace'"
	 * @generated
	 */
	OnBehalfOfType getOnBehalfOf();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getOnBehalfOf <em>On Behalf Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Behalf Of</em>' containment reference.
	 * @see #getOnBehalfOf()
	 * @generated
	 */
	void setOnBehalfOf(OnBehalfOfType value);

	/**
	 * Returns the value of the '<em><b>Open Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Open Access</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Open Access</em>' containment reference.
	 * @see #setOpenAccess(OpenAccessType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_OpenAccess()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='open-access' namespace='##targetNamespace'"
	 * @generated
	 */
	OpenAccessType getOpenAccess();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getOpenAccess <em>Open Access</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Access</em>' containment reference.
	 * @see #getOpenAccess()
	 * @generated
	 */
	void setOpenAccess(OpenAccessType value);

	/**
	 * Returns the value of the '<em><b>Overline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Overline</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overline</em>' containment reference.
	 * @see #setOverline(OverlineType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Overline()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='overline' namespace='##targetNamespace'"
	 * @generated
	 */
	OverlineType getOverline();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getOverline <em>Overline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overline</em>' containment reference.
	 * @see #getOverline()
	 * @generated
	 */
	void setOverline(OverlineType value);

	/**
	 * Returns the value of the '<em><b>Overline End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Overline End</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overline End</em>' containment reference.
	 * @see #setOverlineEnd(OverlineEndType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_OverlineEnd()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='overline-end' namespace='##targetNamespace'"
	 * @generated
	 */
	OverlineEndType getOverlineEnd();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getOverlineEnd <em>Overline End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overline End</em>' containment reference.
	 * @see #getOverlineEnd()
	 * @generated
	 */
	void setOverlineEnd(OverlineEndType value);

	/**
	 * Returns the value of the '<em><b>Overline Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Overline Start</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overline Start</em>' containment reference.
	 * @see #setOverlineStart(OverlineStartType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_OverlineStart()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='overline-start' namespace='##targetNamespace'"
	 * @generated
	 */
	OverlineStartType getOverlineStart();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getOverlineStart <em>Overline Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overline Start</em>' containment reference.
	 * @see #getOverlineStart()
	 * @generated
	 */
	void setOverlineStart(OverlineStartType value);

	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Paragraph</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>P</em>' containment reference.
	 * @see #setP(PType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_P()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace'"
	 * @generated
	 */
	PType getP();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getP <em>P</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P</em>' containment reference.
	 * @see #getP()
	 * @generated
	 */
	void setP(PType value);

	/**
	 * Returns the value of the '<em><b>Page Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Page Count</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Page Count</em>' containment reference.
	 * @see #setPageCount(PageCountType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_PageCount()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-count' namespace='##targetNamespace'"
	 * @generated
	 */
	PageCountType getPageCount();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPageCount <em>Page Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Count</em>' containment reference.
	 * @see #getPageCount()
	 * @generated
	 */
	void setPageCount(PageCountType value);

	/**
	 * Returns the value of the '<em><b>Page Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Page Ranges</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Page Range</em>' containment reference.
	 * @see #setPageRange(PageRangeType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_PageRange()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-range' namespace='##targetNamespace'"
	 * @generated
	 */
	PageRangeType getPageRange();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPageRange <em>Page Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Range</em>' containment reference.
	 * @see #getPageRange()
	 * @generated
	 */
	void setPageRange(PageRangeType value);

	/**
	 * Returns the value of the '<em><b>Part Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Part Title in a Citation</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Title</em>' containment reference.
	 * @see #setPartTitle(PartTitleType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_PartTitle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='part-title' namespace='##targetNamespace'"
	 * @generated
	 */
	PartTitleType getPartTitle();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPartTitle <em>Part Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Title</em>' containment reference.
	 * @see #getPartTitle()
	 * @generated
	 */
	void setPartTitle(PartTitleType value);

	/**
	 * Returns the value of the '<em><b>Patent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Patent Number, Cited</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patent</em>' containment reference.
	 * @see #setPatent(PatentType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Patent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='patent' namespace='##targetNamespace'"
	 * @generated
	 */
	PatentType getPatent();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPatent <em>Patent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patent</em>' containment reference.
	 * @see #getPatent()
	 * @generated
	 */
	void setPatent(PatentType value);

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Permissions</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference.
	 * @see #setPermissions(PermissionsType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Permissions()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='permissions' namespace='##targetNamespace'"
	 * @generated
	 */
	PermissionsType getPermissions();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPermissions <em>Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permissions</em>' containment reference.
	 * @see #getPermissions()
	 * @generated
	 */
	void setPermissions(PermissionsType value);

	/**
	 * Returns the value of the '<em><b>Person Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Person Group For a Cited Publication</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Group</em>' containment reference.
	 * @see #setPersonGroup(PersonGroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_PersonGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='person-group' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonGroupType getPersonGroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPersonGroup <em>Person Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Group</em>' containment reference.
	 * @see #getPersonGroup()
	 * @generated
	 */
	void setPersonGroup(PersonGroupType value);

	/**
	 * Returns the value of the '<em><b>Phone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Phone Number: in an Address</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phone</em>' containment reference.
	 * @see #setPhone(PhoneType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Phone()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='phone' namespace='##targetNamespace'"
	 * @generated
	 */
	PhoneType getPhone();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPhone <em>Phone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone</em>' containment reference.
	 * @see #getPhone()
	 * @generated
	 */
	void setPhone(PhoneType value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Postal Code: in an Address</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Code</em>' containment reference.
	 * @see #setPostalCode(PostalCodeType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_PostalCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='postal-code' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalCodeType getPostalCode();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPostalCode <em>Postal Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' containment reference.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(PostalCodeType value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Prefix</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefix</em>' containment reference.
	 * @see #setPrefix(PrefixType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Prefix()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='prefix' namespace='##targetNamespace'"
	 * @generated
	 */
	PrefixType getPrefix();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPrefix <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' containment reference.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(PrefixType value);

	/**
	 * Returns the value of the '<em><b>Preformat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Preformatted Text</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preformat</em>' containment reference.
	 * @see #setPreformat(PreformatType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Preformat()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='preformat' namespace='##targetNamespace'"
	 * @generated
	 */
	PreformatType getPreformat();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPreformat <em>Preformat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preformat</em>' containment reference.
	 * @see #getPreformat()
	 * @generated
	 */
	void setPreformat(PreformatType value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Price</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Price</em>' containment reference.
	 * @see #setPrice(PriceType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Price()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='price' namespace='##targetNamespace'"
	 * @generated
	 */
	PriceType getPrice();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPrice <em>Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' containment reference.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(PriceType value);

	/**
	 * Returns the value of the '<em><b>Principal Award Recipient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Principal Award Recipient</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Principal Award Recipient</em>' containment reference.
	 * @see #setPrincipalAwardRecipient(PrincipalAwardRecipientType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_PrincipalAwardRecipient()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='principal-award-recipient' namespace='##targetNamespace'"
	 * @generated
	 */
	PrincipalAwardRecipientType getPrincipalAwardRecipient();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPrincipalAwardRecipient <em>Principal Award Recipient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Principal Award Recipient</em>' containment reference.
	 * @see #getPrincipalAwardRecipient()
	 * @generated
	 */
	void setPrincipalAwardRecipient(PrincipalAwardRecipientType value);

	/**
	 * Returns the value of the '<em><b>Principal Investigator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Principal Investigator Recipient</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Principal Investigator</em>' containment reference.
	 * @see #setPrincipalInvestigator(PrincipalInvestigatorType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_PrincipalInvestigator()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='principal-investigator' namespace='##targetNamespace'"
	 * @generated
	 */
	PrincipalInvestigatorType getPrincipalInvestigator();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPrincipalInvestigator <em>Principal Investigator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Principal Investigator</em>' containment reference.
	 * @see #getPrincipalInvestigator()
	 * @generated
	 */
	void setPrincipalInvestigator(PrincipalInvestigatorType value);

	/**
	 * Returns the value of the '<em><b>Private Char</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Private Character (Custom or Unicode)</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private Char</em>' containment reference.
	 * @see #setPrivateChar(PrivateCharType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_PrivateChar()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='private-char' namespace='##targetNamespace'"
	 * @generated
	 */
	PrivateCharType getPrivateChar();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPrivateChar <em>Private Char</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Char</em>' containment reference.
	 * @see #getPrivateChar()
	 * @generated
	 */
	void setPrivateChar(PrivateCharType value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Product Information</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product</em>' containment reference.
	 * @see #setProduct(ProductType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Product()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='product' namespace='##targetNamespace'"
	 * @generated
	 */
	ProductType getProduct();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getProduct <em>Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' containment reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(ProductType value);

	/**
	 * Returns the value of the '<em><b>Pub Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Publication Date</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pub Date</em>' containment reference.
	 * @see #setPubDate(PubDateType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_PubDate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pub-date' namespace='##targetNamespace'"
	 * @generated
	 */
	PubDateType getPubDate();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPubDate <em>Pub Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pub Date</em>' containment reference.
	 * @see #getPubDate()
	 * @generated
	 */
	void setPubDate(PubDateType value);

	/**
	 * Returns the value of the '<em><b>Pub Date Not Available</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Date Not Available Flag</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pub Date Not Available</em>' containment reference.
	 * @see #setPubDateNotAvailable(PubDateNotAvailableType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_PubDateNotAvailable()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pub-date-not-available' namespace='##targetNamespace'"
	 * @generated
	 */
	PubDateNotAvailableType getPubDateNotAvailable();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPubDateNotAvailable <em>Pub Date Not Available</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pub Date Not Available</em>' containment reference.
	 * @see #getPubDateNotAvailable()
	 * @generated
	 */
	void setPubDateNotAvailable(PubDateNotAvailableType value);

	/**
	 * Returns the value of the '<em><b>Pub History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Publication History</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pub History</em>' containment reference.
	 * @see #setPubHistory(PubHistoryType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_PubHistory()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pub-history' namespace='##targetNamespace'"
	 * @generated
	 */
	PubHistoryType getPubHistory();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPubHistory <em>Pub History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pub History</em>' containment reference.
	 * @see #getPubHistory()
	 * @generated
	 */
	void setPubHistory(PubHistoryType value);

	/**
	 * Returns the value of the '<em><b>Pub Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Publication Identifier For a Cited Publication</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pub Id</em>' containment reference.
	 * @see #setPubId(PubIdType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_PubId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pub-id' namespace='##targetNamespace'"
	 * @generated
	 */
	PubIdType getPubId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPubId <em>Pub Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pub Id</em>' containment reference.
	 * @see #getPubId()
	 * @generated
	 */
	void setPubId(PubIdType value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Publisher</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(PublisherType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Publisher()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	PublisherType getPublisher();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(PublisherType value);

	/**
	 * Returns the value of the '<em><b>Publisher Loc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Publisher's Location</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher Loc</em>' containment reference.
	 * @see #setPublisherLoc(PublisherLocType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_PublisherLoc()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publisher-loc' namespace='##targetNamespace'"
	 * @generated
	 */
	PublisherLocType getPublisherLoc();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPublisherLoc <em>Publisher Loc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Loc</em>' containment reference.
	 * @see #getPublisherLoc()
	 * @generated
	 */
	void setPublisherLoc(PublisherLocType value);

	/**
	 * Returns the value of the '<em><b>Publisher Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Publisher's Name</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher Name</em>' containment reference.
	 * @see #setPublisherName(PublisherNameType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_PublisherName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publisher-name' namespace='##targetNamespace'"
	 * @generated
	 */
	PublisherNameType getPublisherName();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getPublisherName <em>Publisher Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Name</em>' containment reference.
	 * @see #getPublisherName()
	 * @generated
	 */
	void setPublisherName(PublisherNameType value);

	/**
	 * Returns the value of the '<em><b>Rb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Ruby Base</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rb</em>' containment reference.
	 * @see #setRb(RbType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Rb()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rb' namespace='##targetNamespace'"
	 * @generated
	 */
	RbType getRb();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getRb <em>Rb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rb</em>' containment reference.
	 * @see #getRb()
	 * @generated
	 */
	void setRb(RbType value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Reference Item</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' containment reference.
	 * @see #setRef(RefType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Ref()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ref' namespace='##targetNamespace'"
	 * @generated
	 */
	RefType getRef();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getRef <em>Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' containment reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(RefType value);

	/**
	 * Returns the value of the '<em><b>Ref Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Reference Count</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref Count</em>' containment reference.
	 * @see #setRefCount(RefCountType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_RefCount()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ref-count' namespace='##targetNamespace'"
	 * @generated
	 */
	RefCountType getRefCount();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getRefCount <em>Ref Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Count</em>' containment reference.
	 * @see #getRefCount()
	 * @generated
	 */
	void setRefCount(RefCountType value);

	/**
	 * Returns the value of the '<em><b>Ref List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Reference List (Bibliographic Reference List)</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref List</em>' containment reference.
	 * @see #setRefList(RefListType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_RefList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ref-list' namespace='##targetNamespace'"
	 * @generated
	 */
	RefListType getRefList();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getRefList <em>Ref List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref List</em>' containment reference.
	 * @see #getRefList()
	 * @generated
	 */
	void setRefList(RefListType value);

	/**
	 * Returns the value of the '<em><b>Related Article</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Related Article Information</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Article</em>' containment reference.
	 * @see #setRelatedArticle(RelatedArticleType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_RelatedArticle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='related-article' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedArticleType getRelatedArticle();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getRelatedArticle <em>Related Article</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Article</em>' containment reference.
	 * @see #getRelatedArticle()
	 * @generated
	 */
	void setRelatedArticle(RelatedArticleType value);

	/**
	 * Returns the value of the '<em><b>Related Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Related Object Information</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Object</em>' containment reference.
	 * @see #setRelatedObject(RelatedObjectType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_RelatedObject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='related-object' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedObjectType getRelatedObject();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getRelatedObject <em>Related Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Object</em>' containment reference.
	 * @see #getRelatedObject()
	 * @generated
	 */
	void setRelatedObject(RelatedObjectType value);

	/**
	 * Returns the value of the '<em><b>Resource Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Resource Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Group</em>' containment reference.
	 * @see #setResourceGroup(ResourceGroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ResourceGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resource-group' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceGroupType getResourceGroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getResourceGroup <em>Resource Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Group</em>' containment reference.
	 * @see #getResourceGroup()
	 * @generated
	 */
	void setResourceGroup(ResourceGroupType value);

	/**
	 * Returns the value of the '<em><b>Resource Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Resource Identifier</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Id</em>' containment reference.
	 * @see #setResourceId(ResourceIdType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ResourceId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resource-id' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceIdType getResourceId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getResourceId <em>Resource Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Id</em>' containment reference.
	 * @see #getResourceId()
	 * @generated
	 */
	void setResourceId(ResourceIdType value);

	/**
	 * Returns the value of the '<em><b>Resource Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Resource Name</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Name</em>' containment reference.
	 * @see #setResourceName(ResourceNameType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ResourceName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resource-name' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceNameType getResourceName();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getResourceName <em>Resource Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Name</em>' containment reference.
	 * @see #getResourceName()
	 * @generated
	 */
	void setResourceName(ResourceNameType value);

	/**
	 * Returns the value of the '<em><b>Resource Wrap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Resource Wrap</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Wrap</em>' containment reference.
	 * @see #setResourceWrap(ResourceWrapType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_ResourceWrap()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resource-wrap' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceWrapType getResourceWrap();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getResourceWrap <em>Resource Wrap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Wrap</em>' containment reference.
	 * @see #getResourceWrap()
	 * @generated
	 */
	void setResourceWrap(ResourceWrapType value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Response</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response</em>' containment reference.
	 * @see #setResponse(ResponseType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Response()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='response' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseType getResponse();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(ResponseType value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Role or Function Title of Contributor</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(RoleType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Role()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleType getRole();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(RoleType value);

	/**
	 * Returns the value of the '<em><b>Roman</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Roman</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roman</em>' containment reference.
	 * @see #setRoman(RomanType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Roman()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='roman' namespace='##targetNamespace'"
	 * @generated
	 */
	RomanType getRoman();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getRoman <em>Roman</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roman</em>' containment reference.
	 * @see #getRoman()
	 * @generated
	 */
	void setRoman(RomanType value);

	/**
	 * Returns the value of the '<em><b>Rp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Ruby Parenthesis</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rp</em>' containment reference.
	 * @see #setRp(RpType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Rp()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rp' namespace='##targetNamespace'"
	 * @generated
	 */
	RpType getRp();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getRp <em>Rp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rp</em>' containment reference.
	 * @see #getRp()
	 * @generated
	 */
	void setRp(RpType value);

	/**
	 * Returns the value of the '<em><b>Rt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Ruby Textual Annotation</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rt</em>' containment reference.
	 * @see #setRt(RtType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Rt()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rt' namespace='##targetNamespace'"
	 * @generated
	 */
	RtType getRt();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getRt <em>Rt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rt</em>' containment reference.
	 * @see #getRt()
	 * @generated
	 */
	void setRt(RtType value);

	/**
	 * Returns the value of the '<em><b>Ruby</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Ruby Wrapper</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ruby</em>' containment reference.
	 * @see #setRuby(RubyType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Ruby()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ruby' namespace='##targetNamespace'"
	 * @generated
	 */
	RubyType getRuby();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getRuby <em>Ruby</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruby</em>' containment reference.
	 * @see #getRuby()
	 * @generated
	 */
	void setRuby(RubyType value);

	/**
	 * Returns the value of the '<em><b>Sans Serif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Sans Serif</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sans Serif</em>' containment reference.
	 * @see #setSansSerif(SansSerifType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_SansSerif()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sans-serif' namespace='##targetNamespace'"
	 * @generated
	 */
	SansSerifType getSansSerif();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSansSerif <em>Sans Serif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sans Serif</em>' containment reference.
	 * @see #getSansSerif()
	 * @generated
	 */
	void setSansSerif(SansSerifType value);

	/**
	 * Returns the value of the '<em><b>Sc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Small Caps</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sc</em>' containment reference.
	 * @see #setSc(ScType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Sc()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sc' namespace='##targetNamespace'"
	 * @generated
	 */
	ScType getSc();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSc <em>Sc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc</em>' containment reference.
	 * @see #getSc()
	 * @generated
	 */
	void setSc(ScType value);

	/**
	 * Returns the value of the '<em><b>Season</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Season</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Season</em>' containment reference.
	 * @see #setSeason(SeasonType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Season()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='season' namespace='##targetNamespace'"
	 * @generated
	 */
	SeasonType getSeason();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSeason <em>Season</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' containment reference.
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(SeasonType value);

	/**
	 * Returns the value of the '<em><b>Sec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Section</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sec</em>' containment reference.
	 * @see #setSec(SecType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Sec()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sec' namespace='##targetNamespace'"
	 * @generated
	 */
	SecType getSec();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSec <em>Sec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sec</em>' containment reference.
	 * @see #getSec()
	 * @generated
	 */
	void setSec(SecType value);

	/**
	 * Returns the value of the '<em><b>Sec Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Section Metadata</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sec Meta</em>' containment reference.
	 * @see #setSecMeta(SecMetaType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_SecMeta()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sec-meta' namespace='##targetNamespace'"
	 * @generated
	 */
	SecMetaType getSecMeta();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSecMeta <em>Sec Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sec Meta</em>' containment reference.
	 * @see #getSecMeta()
	 * @generated
	 */
	void setSecMeta(SecMetaType value);

	/**
	 * Returns the value of the '<em><b>See</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>See</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>See</em>' containment reference.
	 * @see #setSee(SeeType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_See()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='see' namespace='##targetNamespace'"
	 * @generated
	 */
	SeeType getSee();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSee <em>See</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>See</em>' containment reference.
	 * @see #getSee()
	 * @generated
	 */
	void setSee(SeeType value);

	/**
	 * Returns the value of the '<em><b>See Also</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>See-Also Term</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>See Also</em>' containment reference.
	 * @see #setSeeAlso(SeeAlsoType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_SeeAlso()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='see-also' namespace='##targetNamespace'"
	 * @generated
	 */
	SeeAlsoType getSeeAlso();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSeeAlso <em>See Also</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>See Also</em>' containment reference.
	 * @see #getSeeAlso()
	 * @generated
	 */
	void setSeeAlso(SeeAlsoType value);

	/**
	 * Returns the value of the '<em><b>Self Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Uri For This Same Article Online</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Self Uri</em>' containment reference.
	 * @see #setSelfUri(SelfUriType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_SelfUri()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='self-uri' namespace='##targetNamespace'"
	 * @generated
	 */
	SelfUriType getSelfUri();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSelfUri <em>Self Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Uri</em>' containment reference.
	 * @see #getSelfUri()
	 * @generated
	 */
	void setSelfUri(SelfUriType value);

	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Series</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series</em>' containment reference.
	 * @see #setSeries(SeriesType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Series()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='series' namespace='##targetNamespace'"
	 * @generated
	 */
	SeriesType getSeries();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSeries <em>Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series</em>' containment reference.
	 * @see #getSeries()
	 * @generated
	 */
	void setSeries(SeriesType value);

	/**
	 * Returns the value of the '<em><b>Series Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Series Text: Header Text to Describe</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series Text</em>' containment reference.
	 * @see #setSeriesText(SeriesTextType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_SeriesText()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='series-text' namespace='##targetNamespace'"
	 * @generated
	 */
	SeriesTextType getSeriesText();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSeriesText <em>Series Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Text</em>' containment reference.
	 * @see #getSeriesText()
	 * @generated
	 */
	void setSeriesText(SeriesTextType value);

	/**
	 * Returns the value of the '<em><b>Series Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Series Title</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series Title</em>' containment reference.
	 * @see #setSeriesTitle(SeriesTitleType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_SeriesTitle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='series-title' namespace='##targetNamespace'"
	 * @generated
	 */
	SeriesTitleType getSeriesTitle();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSeriesTitle <em>Series Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Title</em>' containment reference.
	 * @see #getSeriesTitle()
	 * @generated
	 */
	void setSeriesTitle(SeriesTitleType value);

	/**
	 * Returns the value of the '<em><b>Sig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Signature</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sig</em>' containment reference.
	 * @see #setSig(SigType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Sig()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sig' namespace='##targetNamespace'"
	 * @generated
	 */
	SigType getSig();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSig <em>Sig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sig</em>' containment reference.
	 * @see #getSig()
	 * @generated
	 */
	void setSig(SigType value);

	/**
	 * Returns the value of the '<em><b>Sig Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Signature Block</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sig Block</em>' containment reference.
	 * @see #setSigBlock(SigBlockType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_SigBlock()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sig-block' namespace='##targetNamespace'"
	 * @generated
	 */
	SigBlockType getSigBlock();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSigBlock <em>Sig Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sig Block</em>' containment reference.
	 * @see #getSigBlock()
	 * @generated
	 */
	void setSigBlock(SigBlockType value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Size</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(SizeType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Size()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='size' namespace='##targetNamespace'"
	 * @generated
	 */
	SizeType getSize();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(SizeType value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Source</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(SourceType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Source()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	SourceType getSource();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SourceType value);

	/**
	 * Returns the value of the '<em><b>Speaker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Speaker</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speaker</em>' containment reference.
	 * @see #setSpeaker(SpeakerType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Speaker()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='speaker' namespace='##targetNamespace'"
	 * @generated
	 */
	SpeakerType getSpeaker();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSpeaker <em>Speaker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speaker</em>' containment reference.
	 * @see #getSpeaker()
	 * @generated
	 */
	void setSpeaker(SpeakerType value);

	/**
	 * Returns the value of the '<em><b>Speech</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Speech</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speech</em>' containment reference.
	 * @see #setSpeech(SpeechType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Speech()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='speech' namespace='##targetNamespace'"
	 * @generated
	 */
	SpeechType getSpeech();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSpeech <em>Speech</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speech</em>' containment reference.
	 * @see #getSpeech()
	 * @generated
	 */
	void setSpeech(SpeechType value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>State or Province: in an Address</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' containment reference.
	 * @see #setState(StateType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_State()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='state' namespace='##targetNamespace'"
	 * @generated
	 */
	StateType getState();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getState <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' containment reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(StateType value);

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Statement, Formal</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference.
	 * @see #setStatement(StatementType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Statement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='statement' namespace='##targetNamespace'"
	 * @generated
	 */
	StatementType getStatement();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getStatement <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' containment reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(StatementType value);

	/**
	 * Returns the value of the '<em><b>Std</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Standard, Cited</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Std</em>' containment reference.
	 * @see #setStd(StdType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Std()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='std' namespace='##targetNamespace'"
	 * @generated
	 */
	StdType getStd();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getStd <em>Std</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std</em>' containment reference.
	 * @see #getStd()
	 * @generated
	 */
	void setStd(StdType value);

	/**
	 * Returns the value of the '<em><b>Std Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Standards Organization</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Std Organization</em>' containment reference.
	 * @see #setStdOrganization(StdOrganizationType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_StdOrganization()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='std-organization' namespace='##targetNamespace'"
	 * @generated
	 */
	StdOrganizationType getStdOrganization();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getStdOrganization <em>Std Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std Organization</em>' containment reference.
	 * @see #getStdOrganization()
	 * @generated
	 */
	void setStdOrganization(StdOrganizationType value);

	/**
	 * Returns the value of the '<em><b>Strike</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Strike Through</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strike</em>' containment reference.
	 * @see #setStrike(StrikeType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Strike()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='strike' namespace='##targetNamespace'"
	 * @generated
	 */
	StrikeType getStrike();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getStrike <em>Strike</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strike</em>' containment reference.
	 * @see #getStrike()
	 * @generated
	 */
	void setStrike(StrikeType value);

	/**
	 * Returns the value of the '<em><b>String Conf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>String Conference Name</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>String Conf</em>' containment reference.
	 * @see #setStringConf(StringConfType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_StringConf()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='string-conf' namespace='##targetNamespace'"
	 * @generated
	 */
	StringConfType getStringConf();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getStringConf <em>String Conf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Conf</em>' containment reference.
	 * @see #getStringConf()
	 * @generated
	 */
	void setStringConf(StringConfType value);

	/**
	 * Returns the value of the '<em><b>String Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Date As a String</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>String Date</em>' containment reference.
	 * @see #setStringDate(StringDateType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_StringDate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='string-date' namespace='##targetNamespace'"
	 * @generated
	 */
	StringDateType getStringDate();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getStringDate <em>String Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Date</em>' containment reference.
	 * @see #getStringDate()
	 * @generated
	 */
	void setStringDate(StringDateType value);

	/**
	 * Returns the value of the '<em><b>String Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Name of Person (Unstructured)</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>String Name</em>' containment reference.
	 * @see #setStringName(StringNameType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_StringName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='string-name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringNameType getStringName();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getStringName <em>String Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Name</em>' containment reference.
	 * @see #getStringName()
	 * @generated
	 */
	void setStringName(StringNameType value);

	/**
	 * Returns the value of the '<em><b>Styled Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Styled Special (Subject) Content</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Styled Content</em>' containment reference.
	 * @see #setStyledContent(StyledContentType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_StyledContent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='styled-content' namespace='##targetNamespace'"
	 * @generated
	 */
	StyledContentType getStyledContent();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getStyledContent <em>Styled Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Styled Content</em>' containment reference.
	 * @see #getStyledContent()
	 * @generated
	 */
	void setStyledContent(StyledContentType value);

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Subscript</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub</em>' containment reference.
	 * @see #setSub(SubType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Sub()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sub' namespace='##targetNamespace'"
	 * @generated
	 */
	SubType getSub();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSub <em>Sub</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub</em>' containment reference.
	 * @see #getSub()
	 * @generated
	 */
	void setSub(SubType value);

	/**
	 * Returns the value of the '<em><b>Sub Article</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Sub-Article</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Article</em>' containment reference.
	 * @see #setSubArticle(SubArticleType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_SubArticle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sub-article' namespace='##targetNamespace'"
	 * @generated
	 */
	SubArticleType getSubArticle();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSubArticle <em>Sub Article</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Article</em>' containment reference.
	 * @see #getSubArticle()
	 * @generated
	 */
	void setSubArticle(SubArticleType value);

	/**
	 * Returns the value of the '<em><b>Subj Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subj Group</em>' containment reference.
	 * @see #setSubjGroup(SubjGroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_SubjGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subj-group' namespace='##targetNamespace'"
	 * @generated
	 */
	SubjGroupType getSubjGroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSubjGroup <em>Subj Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subj Group</em>' containment reference.
	 * @see #getSubjGroup()
	 * @generated
	 */
	void setSubjGroup(SubjGroupType value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Subject Name</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(SubjectType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Subject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	SubjectType getSubject();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(SubjectType value);

	/**
	 * Returns the value of the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Article Subtitle</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subtitle</em>' containment reference.
	 * @see #setSubtitle(SubtitleType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Subtitle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subtitle' namespace='##targetNamespace'"
	 * @generated
	 */
	SubtitleType getSubtitle();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSubtitle <em>Subtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtitle</em>' containment reference.
	 * @see #getSubtitle()
	 * @generated
	 */
	void setSubtitle(SubtitleType value);

	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Suffix</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Suffix</em>' containment reference.
	 * @see #setSuffix(SuffixType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Suffix()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='suffix' namespace='##targetNamespace'"
	 * @generated
	 */
	SuffixType getSuffix();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSuffix <em>Suffix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suffix</em>' containment reference.
	 * @see #getSuffix()
	 * @generated
	 */
	void setSuffix(SuffixType value);

	/**
	 * Returns the value of the '<em><b>Sup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Superscript</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sup</em>' containment reference.
	 * @see #setSup(SupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Sup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sup' namespace='##targetNamespace'"
	 * @generated
	 */
	SupType getSup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSup <em>Sup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sup</em>' containment reference.
	 * @see #getSup()
	 * @generated
	 */
	void setSup(SupType value);

	/**
	 * Returns the value of the '<em><b>Supplement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Supplement</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplement</em>' containment reference.
	 * @see #setSupplement(SupplementType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Supplement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='supplement' namespace='##targetNamespace'"
	 * @generated
	 */
	SupplementType getSupplement();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSupplement <em>Supplement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplement</em>' containment reference.
	 * @see #getSupplement()
	 * @generated
	 */
	void setSupplement(SupplementType value);

	/**
	 * Returns the value of the '<em><b>Supplementary Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Supplementary Material</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplementary Material</em>' containment reference.
	 * @see #setSupplementaryMaterial(SupplementaryMaterialType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_SupplementaryMaterial()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='supplementary-material' namespace='##targetNamespace'"
	 * @generated
	 */
	SupplementaryMaterialType getSupplementaryMaterial();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSupplementaryMaterial <em>Supplementary Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplementary Material</em>' containment reference.
	 * @see #getSupplementaryMaterial()
	 * @generated
	 */
	void setSupplementaryMaterial(SupplementaryMaterialType value);

	/**
	 * Returns the value of the '<em><b>Support Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Support Description</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Support Description</em>' containment reference.
	 * @see #setSupportDescription(SupportDescriptionType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_SupportDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='support-description' namespace='##targetNamespace'"
	 * @generated
	 */
	SupportDescriptionType getSupportDescription();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSupportDescription <em>Support Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support Description</em>' containment reference.
	 * @see #getSupportDescription()
	 * @generated
	 */
	void setSupportDescription(SupportDescriptionType value);

	/**
	 * Returns the value of the '<em><b>Support Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Support Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Support Group</em>' containment reference.
	 * @see #setSupportGroup(SupportGroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_SupportGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='support-group' namespace='##targetNamespace'"
	 * @generated
	 */
	SupportGroupType getSupportGroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSupportGroup <em>Support Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support Group</em>' containment reference.
	 * @see #getSupportGroup()
	 * @generated
	 */
	void setSupportGroup(SupportGroupType value);

	/**
	 * Returns the value of the '<em><b>Support Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Support Source</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Support Source</em>' containment reference.
	 * @see #setSupportSource(SupportSourceType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_SupportSource()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='support-source' namespace='##targetNamespace'"
	 * @generated
	 */
	SupportSourceType getSupportSource();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSupportSource <em>Support Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support Source</em>' containment reference.
	 * @see #getSupportSource()
	 * @generated
	 */
	void setSupportSource(SupportSourceType value);

	/**
	 * Returns the value of the '<em><b>Surname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Surname</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surname</em>' containment reference.
	 * @see #setSurname(SurnameType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Surname()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='surname' namespace='##targetNamespace'"
	 * @generated
	 */
	SurnameType getSurname();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getSurname <em>Surname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surname</em>' containment reference.
	 * @see #getSurname()
	 * @generated
	 */
	void setSurname(SurnameType value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Table: Table Element ..............................</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Table</em>' containment reference.
	 * @see #setTable(TableType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Table()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table' namespace='##targetNamespace'"
	 * @generated
	 */
	TableType getTable();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTable <em>Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' containment reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(TableType value);

	/**
	 * Returns the value of the '<em><b>Table Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Table Count</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Table Count</em>' containment reference.
	 * @see #setTableCount(TableCountType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_TableCount()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-count' namespace='##targetNamespace'"
	 * @generated
	 */
	TableCountType getTableCount();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTableCount <em>Table Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Count</em>' containment reference.
	 * @see #getTableCount()
	 * @generated
	 */
	void setTableCount(TableCountType value);

	/**
	 * Returns the value of the '<em><b>Table Wrap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Table Wrapper</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Table Wrap</em>' containment reference.
	 * @see #setTableWrap(TableWrapType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_TableWrap()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-wrap' namespace='##targetNamespace'"
	 * @generated
	 */
	TableWrapType getTableWrap();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTableWrap <em>Table Wrap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Wrap</em>' containment reference.
	 * @see #getTableWrap()
	 * @generated
	 */
	void setTableWrap(TableWrapType value);

	/**
	 * Returns the value of the '<em><b>Table Wrap Foot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Table Wrap Footer</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Table Wrap Foot</em>' containment reference.
	 * @see #setTableWrapFoot(TableWrapFootType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_TableWrapFoot()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-wrap-foot' namespace='##targetNamespace'"
	 * @generated
	 */
	TableWrapFootType getTableWrapFoot();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTableWrapFoot <em>Table Wrap Foot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Wrap Foot</em>' containment reference.
	 * @see #getTableWrapFoot()
	 * @generated
	 */
	void setTableWrapFoot(TableWrapFootType value);

	/**
	 * Returns the value of the '<em><b>Table Wrap Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Table Wrapper Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Table Wrap Group</em>' containment reference.
	 * @see #setTableWrapGroup(TableWrapGroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_TableWrapGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-wrap-group' namespace='##targetNamespace'"
	 * @generated
	 */
	TableWrapGroupType getTableWrapGroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTableWrapGroup <em>Table Wrap Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Wrap Group</em>' containment reference.
	 * @see #getTableWrapGroup()
	 * @generated
	 */
	void setTableWrapGroup(TableWrapGroupType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Target of an Internal Link</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(TargetType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Target()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetType getTarget();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TargetType value);

	/**
	 * Returns the value of the '<em><b>Tbody</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tbody</em>' containment reference.
	 * @see #setTbody(TbodyType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Tbody()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tbody' namespace='##targetNamespace'"
	 * @generated
	 */
	TbodyType getTbody();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTbody <em>Tbody</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tbody</em>' containment reference.
	 * @see #getTbody()
	 * @generated
	 */
	void setTbody(TbodyType value);

	/**
	 * Returns the value of the '<em><b>Td</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Td</em>' containment reference.
	 * @see #setTd(TdType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Td()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='td' namespace='##targetNamespace'"
	 * @generated
	 */
	TdType getTd();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTd <em>Td</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Td</em>' containment reference.
	 * @see #getTd()
	 * @generated
	 */
	void setTd(TdType value);

	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Definition List: Term</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term</em>' containment reference.
	 * @see #setTerm(TermType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Term()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='term' namespace='##targetNamespace'"
	 * @generated
	 */
	TermType getTerm();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTerm <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' containment reference.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(TermType value);

	/**
	 * Returns the value of the '<em><b>Term Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Definition List: Term Head</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term Head</em>' containment reference.
	 * @see #setTermHead(TermHeadType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_TermHead()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='term-head' namespace='##targetNamespace'"
	 * @generated
	 */
	TermHeadType getTermHead();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTermHead <em>Term Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Head</em>' containment reference.
	 * @see #getTermHead()
	 * @generated
	 */
	void setTermHead(TermHeadType value);

	/**
	 * Returns the value of the '<em><b>Tex Math</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Tex Math Equation</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tex Math</em>' containment reference.
	 * @see #setTexMath(TexMathType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_TexMath()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tex-math' namespace='##targetNamespace'"
	 * @generated
	 */
	TexMathType getTexMath();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTexMath <em>Tex Math</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tex Math</em>' containment reference.
	 * @see #getTexMath()
	 * @generated
	 */
	void setTexMath(TexMathType value);

	/**
	 * Returns the value of the '<em><b>Textual Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Textual Form</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Textual Form</em>' containment reference.
	 * @see #setTextualForm(TextualFormType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_TextualForm()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='textual-form' namespace='##targetNamespace'"
	 * @generated
	 */
	TextualFormType getTextualForm();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTextualForm <em>Textual Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textual Form</em>' containment reference.
	 * @see #getTextualForm()
	 * @generated
	 */
	void setTextualForm(TextualFormType value);

	/**
	 * Returns the value of the '<em><b>Tfoot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tfoot</em>' containment reference.
	 * @see #setTfoot(TfootType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Tfoot()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tfoot' namespace='##targetNamespace'"
	 * @generated
	 */
	TfootType getTfoot();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTfoot <em>Tfoot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tfoot</em>' containment reference.
	 * @see #getTfoot()
	 * @generated
	 */
	void setTfoot(TfootType value);

	/**
	 * Returns the value of the '<em><b>Th</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Th</em>' containment reference.
	 * @see #setTh(ThType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Th()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='th' namespace='##targetNamespace'"
	 * @generated
	 */
	ThType getTh();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTh <em>Th</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Th</em>' containment reference.
	 * @see #getTh()
	 * @generated
	 */
	void setTh(ThType value);

	/**
	 * Returns the value of the '<em><b>Thead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thead</em>' containment reference.
	 * @see #setThead(TheadType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Thead()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='thead' namespace='##targetNamespace'"
	 * @generated
	 */
	TheadType getThead();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getThead <em>Thead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thead</em>' containment reference.
	 * @see #getThead()
	 * @generated
	 */
	void setThead(TheadType value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Time Stamp For Cited Work</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Stamp</em>' containment reference.
	 * @see #setTimeStamp(TimeStampType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_TimeStamp()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='time-stamp' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeStampType getTimeStamp();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTimeStamp <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' containment reference.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(TimeStampType value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Title</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(TitleType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Title()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	TitleType getTitle();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(TitleType value);

	/**
	 * Returns the value of the '<em><b>Title Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Title Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title Group</em>' containment reference.
	 * @see #setTitleGroup(TitleGroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_TitleGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title-group' namespace='##targetNamespace'"
	 * @generated
	 */
	TitleGroupType getTitleGroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTitleGroup <em>Title Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Group</em>' containment reference.
	 * @see #getTitleGroup()
	 * @generated
	 */
	void setTitleGroup(TitleGroupType value);

	/**
	 * Returns the value of the '<em><b>Tr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tr</em>' containment reference.
	 * @see #setTr(TrType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Tr()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tr' namespace='##targetNamespace'"
	 * @generated
	 */
	TrType getTr();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTr <em>Tr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tr</em>' containment reference.
	 * @see #getTr()
	 * @generated
	 */
	void setTr(TrType value);

	/**
	 * Returns the value of the '<em><b>Trans Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Translated Abstract</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trans Abstract</em>' containment reference.
	 * @see #setTransAbstract(TransAbstractType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_TransAbstract()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='trans-abstract' namespace='##targetNamespace'"
	 * @generated
	 */
	TransAbstractType getTransAbstract();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTransAbstract <em>Trans Abstract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trans Abstract</em>' containment reference.
	 * @see #getTransAbstract()
	 * @generated
	 */
	void setTransAbstract(TransAbstractType value);

	/**
	 * Returns the value of the '<em><b>Trans Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Translated Source</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trans Source</em>' containment reference.
	 * @see #setTransSource(TransSourceType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_TransSource()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='trans-source' namespace='##targetNamespace'"
	 * @generated
	 */
	TransSourceType getTransSource();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTransSource <em>Trans Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trans Source</em>' containment reference.
	 * @see #getTransSource()
	 * @generated
	 */
	void setTransSource(TransSourceType value);

	/**
	 * Returns the value of the '<em><b>Trans Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Translated Subtitle</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trans Subtitle</em>' containment reference.
	 * @see #setTransSubtitle(TransSubtitleType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_TransSubtitle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='trans-subtitle' namespace='##targetNamespace'"
	 * @generated
	 */
	TransSubtitleType getTransSubtitle();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTransSubtitle <em>Trans Subtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trans Subtitle</em>' containment reference.
	 * @see #getTransSubtitle()
	 * @generated
	 */
	void setTransSubtitle(TransSubtitleType value);

	/**
	 * Returns the value of the '<em><b>Trans Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Translated Title</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trans Title</em>' containment reference.
	 * @see #setTransTitle(TransTitleType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_TransTitle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='trans-title' namespace='##targetNamespace'"
	 * @generated
	 */
	TransTitleType getTransTitle();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTransTitle <em>Trans Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trans Title</em>' containment reference.
	 * @see #getTransTitle()
	 * @generated
	 */
	void setTransTitle(TransTitleType value);

	/**
	 * Returns the value of the '<em><b>Trans Title Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Translated Title Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trans Title Group</em>' containment reference.
	 * @see #setTransTitleGroup(TransTitleGroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_TransTitleGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='trans-title-group' namespace='##targetNamespace'"
	 * @generated
	 */
	TransTitleGroupType getTransTitleGroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getTransTitleGroup <em>Trans Title Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trans Title Group</em>' containment reference.
	 * @see #getTransTitleGroup()
	 * @generated
	 */
	void setTransTitleGroup(TransTitleGroupType value);

	/**
	 * Returns the value of the '<em><b>Underline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Underline</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Underline</em>' containment reference.
	 * @see #setUnderline(UnderlineType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Underline()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='underline' namespace='##targetNamespace'"
	 * @generated
	 */
	UnderlineType getUnderline();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getUnderline <em>Underline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Underline</em>' containment reference.
	 * @see #getUnderline()
	 * @generated
	 */
	void setUnderline(UnderlineType value);

	/**
	 * Returns the value of the '<em><b>Underline End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Underline End</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Underline End</em>' containment reference.
	 * @see #setUnderlineEnd(UnderlineEndType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_UnderlineEnd()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='underline-end' namespace='##targetNamespace'"
	 * @generated
	 */
	UnderlineEndType getUnderlineEnd();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getUnderlineEnd <em>Underline End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Underline End</em>' containment reference.
	 * @see #getUnderlineEnd()
	 * @generated
	 */
	void setUnderlineEnd(UnderlineEndType value);

	/**
	 * Returns the value of the '<em><b>Underline Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Underline Start</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Underline Start</em>' containment reference.
	 * @see #setUnderlineStart(UnderlineStartType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_UnderlineStart()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='underline-start' namespace='##targetNamespace'"
	 * @generated
	 */
	UnderlineStartType getUnderlineStart();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getUnderlineStart <em>Underline Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Underline Start</em>' containment reference.
	 * @see #getUnderlineStart()
	 * @generated
	 */
	void setUnderlineStart(UnderlineStartType value);

	/**
	 * Returns the value of the '<em><b>Unstructured Kwd Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Unstructured Keyword Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unstructured Kwd Group</em>' containment reference.
	 * @see #setUnstructuredKwdGroup(UnstructuredKwdGroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_UnstructuredKwdGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unstructured-kwd-group' namespace='##targetNamespace'"
	 * @generated
	 */
	UnstructuredKwdGroupType getUnstructuredKwdGroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getUnstructuredKwdGroup <em>Unstructured Kwd Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unstructured Kwd Group</em>' containment reference.
	 * @see #getUnstructuredKwdGroup()
	 * @generated
	 */
	void setUnstructuredKwdGroup(UnstructuredKwdGroupType value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Uri</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri</em>' containment reference.
	 * @see #setUri(UriType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Uri()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='uri' namespace='##targetNamespace'"
	 * @generated
	 */
	UriType getUri();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getUri <em>Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' containment reference.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(UriType value);

	/**
	 * Returns the value of the '<em><b>Verse Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Verse Form For Poetry</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verse Group</em>' containment reference.
	 * @see #setVerseGroup(VerseGroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_VerseGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='verse-group' namespace='##targetNamespace'"
	 * @generated
	 */
	VerseGroupType getVerseGroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getVerseGroup <em>Verse Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verse Group</em>' containment reference.
	 * @see #getVerseGroup()
	 * @generated
	 */
	void setVerseGroup(VerseGroupType value);

	/**
	 * Returns the value of the '<em><b>Verse Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Line of a Verse</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verse Line</em>' containment reference.
	 * @see #setVerseLine(VerseLineType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_VerseLine()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='verse-line' namespace='##targetNamespace'"
	 * @generated
	 */
	VerseLineType getVerseLine();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getVerseLine <em>Verse Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verse Line</em>' containment reference.
	 * @see #getVerseLine()
	 * @generated
	 */
	void setVerseLine(VerseLineType value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Version Statement, Cited</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(VersionType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Version()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	VersionType getVersion();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(VersionType value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Volume Number</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume</em>' containment reference.
	 * @see #setVolume(VolumeType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Volume()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='volume' namespace='##targetNamespace'"
	 * @generated
	 */
	VolumeType getVolume();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getVolume <em>Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' containment reference.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(VolumeType value);

	/**
	 * Returns the value of the '<em><b>Volume Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Volume Identifier</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume Id</em>' containment reference.
	 * @see #setVolumeId(VolumeIdType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_VolumeId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='volume-id' namespace='##targetNamespace'"
	 * @generated
	 */
	VolumeIdType getVolumeId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getVolumeId <em>Volume Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Id</em>' containment reference.
	 * @see #getVolumeId()
	 * @generated
	 */
	void setVolumeId(VolumeIdType value);

	/**
	 * Returns the value of the '<em><b>Volume Issue Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Translated Title Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume Issue Group</em>' containment reference.
	 * @see #setVolumeIssueGroup(VolumeIssueGroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_VolumeIssueGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='volume-issue-group' namespace='##targetNamespace'"
	 * @generated
	 */
	VolumeIssueGroupType getVolumeIssueGroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getVolumeIssueGroup <em>Volume Issue Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Issue Group</em>' containment reference.
	 * @see #getVolumeIssueGroup()
	 * @generated
	 */
	void setVolumeIssueGroup(VolumeIssueGroupType value);

	/**
	 * Returns the value of the '<em><b>Volume Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Volume Series</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume Series</em>' containment reference.
	 * @see #setVolumeSeries(VolumeSeriesType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_VolumeSeries()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='volume-series' namespace='##targetNamespace'"
	 * @generated
	 */
	VolumeSeriesType getVolumeSeries();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getVolumeSeries <em>Volume Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Series</em>' containment reference.
	 * @see #getVolumeSeries()
	 * @generated
	 */
	void setVolumeSeries(VolumeSeriesType value);

	/**
	 * Returns the value of the '<em><b>Word Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Word Count</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Word Count</em>' containment reference.
	 * @see #setWordCount(WordCountType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_WordCount()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='word-count' namespace='##targetNamespace'"
	 * @generated
	 */
	WordCountType getWordCount();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getWordCount <em>Word Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Word Count</em>' containment reference.
	 * @see #getWordCount()
	 * @generated
	 */
	void setWordCount(WordCountType value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>X - Generated Text and Punctuation</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' containment reference.
	 * @see #setX(XType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_X()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='x' namespace='##targetNamespace'"
	 * @generated
	 */
	XType getX();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getX <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' containment reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(XType value);

	/**
	 * Returns the value of the '<em><b>Xref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>X(cross) Reference</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xref</em>' containment reference.
	 * @see #setXref(XrefType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Xref()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='xref' namespace='##targetNamespace'"
	 * @generated
	 */
	XrefType getXref();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getXref <em>Xref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xref</em>' containment reference.
	 * @see #getXref()
	 * @generated
	 */
	void setXref(XrefType value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Year</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Year</em>' containment reference.
	 * @see #setYear(YearType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getDocumentRoot_Year()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='year' namespace='##targetNamespace'"
	 * @generated
	 */
	YearType getYear();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.DocumentRoot#getYear <em>Year</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' containment reference.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(YearType value);

} // DocumentRoot
