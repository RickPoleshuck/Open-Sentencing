/*
 * Outcarcerate
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * Sentence
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-10-05T20:11:58.952Z")
public class Sentence   {
  @JsonProperty("_id")
  private String _id = null;

  @JsonProperty("_rev")
  private String _rev = null;

  /**
   * Gets or Sets chargeDisposition
   */
  public enum ChargeDispositionEnum {
    BFW("BFW"),
    
    DEATH_SUGGESTED_CAUSE_ABATED("Death Suggested-Cause Abated"),
    
    FINDING_GUILTY("Finding Guilty"),
    
    FNG("FNG"),
    
    FNPC("FNPC"),
    
    NOLLE_PROSECUTION("Nolle Prosecution"),
    
    NULL("Null"),
    
    PLEA_OF_GUILTY("Plea of Guilty"),
    
    SOL("SOL"),
    
    VERDICT_NOT_GUILTY("Verdict-Not Guilty"),
    
    VERDICT_GUILTY("Verdict Guilty");

    private String value;

    ChargeDispositionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ChargeDispositionEnum fromValue(String text) {
      for (ChargeDispositionEnum b : ChargeDispositionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("chargeDisposition")
  private ChargeDispositionEnum chargeDisposition = null;

  @JsonProperty("phase")
  private String phase = null;

  /**
   * Gets or Sets sentenceType
   */
  public enum SentenceTypeEnum {
    PRISON_ONLY("Prison Only"),
    
    PRISON_AND_ALTERNATIVES("Prison and Alternatives"),
    
    PROBATION_ONLY("Probation Only"),
    
    PROBATION_AND_ALTERNATIVES("Probation and Alternatives"),
    
    FINE_ORDERED_NO_RESTITUTION("Fine Ordered/No Restitution"),
    
    RESTITUTION_ORDERED_NO_FINE("Restitution Ordered/No Fine"),
    
    BOTH_FINE_RESTITUTION_ORDERED("Both Fine & Restitution Ordered"),
    
    PRISON("Prison"),
    
    SUPERVISION("Supervision"),
    
    CONDITIONAL_DISCHARGE("Conditional Discharge"),
    
    PROBATION("Probation"),
    
    JAIL("Jail"),
    
    CONVERSION("Conversion"),
    
    COOK_COUNTY_BOOT_CAMP("Cook County Boot Camp"),
    
    PROBATION_TERMINATED_SATISFACTORILY("Probation Terminated Satisfactorily"),
    
    INPATIENT_MENTAL_HEALTH_SERVICES("Inpatient Mental Health Services"),
    
    PROBATION_TERMINATED_UNSATISFACTORILY("Probation Terminated Unsatisfactorily"),
    
    CONDITIONAL_RELEASE("Conditional Release"),
    
    PROBATION_TERMINATED_INSTANTER("Probation Terminated Instanter"),
    
    DEATH("Death"),
    
    _2ND_CHANCE_PROBATION("2nd Chance Probation");

    private String value;

    SentenceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SentenceTypeEnum fromValue(String text) {
      for (SentenceTypeEnum b : SentenceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("sentence_type")
  private SentenceTypeEnum sentenceType = null;

  @JsonProperty("commitmentTerm")
  private Long commitmentTerm = null;

  @JsonProperty("commitmentUnit")
  private String commitmentUnit = null;

  @JsonProperty("commitmentType")
  private String commitmentType = null;

  @JsonProperty("minimum_incarceration_months")
  private Long minimumIncarcerationMonths = null;

  @JsonProperty("maximum_incarceration_months")
  private Long maximumIncarcerationMonths = null;

  @JsonProperty("probation_term_months")
  private Long probationTermMonths = null;

  @JsonProperty("minimum_probation_months")
  private Long minimumProbationMonths = null;

  @JsonProperty("maximum_probation_months")
  private Long maximumProbationMonths = null;

  @JsonProperty("fine_dollars")
  private Long fineDollars = null;

  @JsonProperty("minimum_fine_dollars")
  private Long minimumFineDollars = null;

  @JsonProperty("maximum_fine_dollars")
  private Long maximumFineDollars = null;

  @JsonProperty("community_service_hours")
  private Long communityServiceHours = null;

  @JsonProperty("restitution")
  private String restitution = null;

  @JsonProperty("alternative_sentence")
  private String alternativeSentence = null;

  @JsonProperty("suspended_sentence")
  private Boolean suspendedSentence = null;

  public Sentence id(String id) {
    this._id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @JsonProperty("_id")
  @ApiModelProperty(value = "")
  public String getId() {
    return _id;
  }

  public void setId(String id) {
    this._id = id;
  }

  public Sentence rev(String rev) {
    this._rev = rev;
    return this;
  }

  /**
   * Get rev
   * @return rev
   **/
  @JsonProperty("_rev")
  @ApiModelProperty(value = "")
  public String getRev() {
    return _rev;
  }

  public void setRev(String rev) {
    this._rev = rev;
  }

  public Sentence chargeDisposition(ChargeDispositionEnum chargeDisposition) {
    this.chargeDisposition = chargeDisposition;
    return this;
  }

  /**
   * Get chargeDisposition
   * @return chargeDisposition
   **/
  @JsonProperty("chargeDisposition")
  @ApiModelProperty(value = "")
  public ChargeDispositionEnum getChargeDisposition() {
    return chargeDisposition;
  }

  public void setChargeDisposition(ChargeDispositionEnum chargeDisposition) {
    this.chargeDisposition = chargeDisposition;
  }

  public Sentence phase(String phase) {
    this.phase = phase;
    return this;
  }

  /**
   * Get phase
   * @return phase
   **/
  @JsonProperty("phase")
  @ApiModelProperty(value = "")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public Sentence sentenceType(SentenceTypeEnum sentenceType) {
    this.sentenceType = sentenceType;
    return this;
  }

  /**
   * Get sentenceType
   * @return sentenceType
   **/
  @JsonProperty("sentence_type")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public SentenceTypeEnum getSentenceType() {
    return sentenceType;
  }

  public void setSentenceType(SentenceTypeEnum sentenceType) {
    this.sentenceType = sentenceType;
  }

  public Sentence commitmentTerm(Long commitmentTerm) {
    this.commitmentTerm = commitmentTerm;
    return this;
  }

  /**
   * Get commitmentTerm
   * @return commitmentTerm
   **/
  @JsonProperty("commitmentTerm")
  @ApiModelProperty(value = "")
  public Long getCommitmentTerm() {
    return commitmentTerm;
  }

  public void setCommitmentTerm(Long commitmentTerm) {
    this.commitmentTerm = commitmentTerm;
  }

  public Sentence commitmentUnit(String commitmentUnit) {
    this.commitmentUnit = commitmentUnit;
    return this;
  }

  /**
   * Get commitmentUnit
   * @return commitmentUnit
   **/
  @JsonProperty("commitmentUnit")
  @ApiModelProperty(value = "")
  public String getCommitmentUnit() {
    return commitmentUnit;
  }

  public void setCommitmentUnit(String commitmentUnit) {
    this.commitmentUnit = commitmentUnit;
  }

  public Sentence commitmentType(String commitmentType) {
    this.commitmentType = commitmentType;
    return this;
  }

  /**
   * Get commitmentType
   * @return commitmentType
   **/
  @JsonProperty("commitmentType")
  @ApiModelProperty(value = "")
  public String getCommitmentType() {
    return commitmentType;
  }

  public void setCommitmentType(String commitmentType) {
    this.commitmentType = commitmentType;
  }

  public Sentence minimumIncarcerationMonths(Long minimumIncarcerationMonths) {
    this.minimumIncarcerationMonths = minimumIncarcerationMonths;
    return this;
  }

  /**
   * Get minimumIncarcerationMonths
   * @return minimumIncarcerationMonths
   **/
  @JsonProperty("minimum_incarceration_months")
  @ApiModelProperty(value = "")
  public Long getMinimumIncarcerationMonths() {
    return minimumIncarcerationMonths;
  }

  public void setMinimumIncarcerationMonths(Long minimumIncarcerationMonths) {
    this.minimumIncarcerationMonths = minimumIncarcerationMonths;
  }

  public Sentence maximumIncarcerationMonths(Long maximumIncarcerationMonths) {
    this.maximumIncarcerationMonths = maximumIncarcerationMonths;
    return this;
  }

  /**
   * Get maximumIncarcerationMonths
   * @return maximumIncarcerationMonths
   **/
  @JsonProperty("maximum_incarceration_months")
  @ApiModelProperty(value = "")
  public Long getMaximumIncarcerationMonths() {
    return maximumIncarcerationMonths;
  }

  public void setMaximumIncarcerationMonths(Long maximumIncarcerationMonths) {
    this.maximumIncarcerationMonths = maximumIncarcerationMonths;
  }

  public Sentence probationTermMonths(Long probationTermMonths) {
    this.probationTermMonths = probationTermMonths;
    return this;
  }

  /**
   * Get probationTermMonths
   * @return probationTermMonths
   **/
  @JsonProperty("probation_term_months")
  @ApiModelProperty(value = "")
  public Long getProbationTermMonths() {
    return probationTermMonths;
  }

  public void setProbationTermMonths(Long probationTermMonths) {
    this.probationTermMonths = probationTermMonths;
  }

  public Sentence minimumProbationMonths(Long minimumProbationMonths) {
    this.minimumProbationMonths = minimumProbationMonths;
    return this;
  }

  /**
   * Get minimumProbationMonths
   * @return minimumProbationMonths
   **/
  @JsonProperty("minimum_probation_months")
  @ApiModelProperty(value = "")
  public Long getMinimumProbationMonths() {
    return minimumProbationMonths;
  }

  public void setMinimumProbationMonths(Long minimumProbationMonths) {
    this.minimumProbationMonths = minimumProbationMonths;
  }

  public Sentence maximumProbationMonths(Long maximumProbationMonths) {
    this.maximumProbationMonths = maximumProbationMonths;
    return this;
  }

  /**
   * Get maximumProbationMonths
   * @return maximumProbationMonths
   **/
  @JsonProperty("maximum_probation_months")
  @ApiModelProperty(value = "")
  public Long getMaximumProbationMonths() {
    return maximumProbationMonths;
  }

  public void setMaximumProbationMonths(Long maximumProbationMonths) {
    this.maximumProbationMonths = maximumProbationMonths;
  }

  public Sentence fineDollars(Long fineDollars) {
    this.fineDollars = fineDollars;
    return this;
  }

  /**
   * Get fineDollars
   * @return fineDollars
   **/
  @JsonProperty("fine_dollars")
  @ApiModelProperty(value = "")
  public Long getFineDollars() {
    return fineDollars;
  }

  public void setFineDollars(Long fineDollars) {
    this.fineDollars = fineDollars;
  }

  public Sentence minimumFineDollars(Long minimumFineDollars) {
    this.minimumFineDollars = minimumFineDollars;
    return this;
  }

  /**
   * Get minimumFineDollars
   * @return minimumFineDollars
   **/
  @JsonProperty("minimum_fine_dollars")
  @ApiModelProperty(value = "")
  public Long getMinimumFineDollars() {
    return minimumFineDollars;
  }

  public void setMinimumFineDollars(Long minimumFineDollars) {
    this.minimumFineDollars = minimumFineDollars;
  }

  public Sentence maximumFineDollars(Long maximumFineDollars) {
    this.maximumFineDollars = maximumFineDollars;
    return this;
  }

  /**
   * Get maximumFineDollars
   * @return maximumFineDollars
   **/
  @JsonProperty("maximum_fine_dollars")
  @ApiModelProperty(value = "")
  public Long getMaximumFineDollars() {
    return maximumFineDollars;
  }

  public void setMaximumFineDollars(Long maximumFineDollars) {
    this.maximumFineDollars = maximumFineDollars;
  }

  public Sentence communityServiceHours(Long communityServiceHours) {
    this.communityServiceHours = communityServiceHours;
    return this;
  }

  /**
   * Get communityServiceHours
   * @return communityServiceHours
   **/
  @JsonProperty("community_service_hours")
  @ApiModelProperty(value = "")
  public Long getCommunityServiceHours() {
    return communityServiceHours;
  }

  public void setCommunityServiceHours(Long communityServiceHours) {
    this.communityServiceHours = communityServiceHours;
  }

  public Sentence restitution(String restitution) {
    this.restitution = restitution;
    return this;
  }

  /**
   * Get restitution
   * @return restitution
   **/
  @JsonProperty("restitution")
  @ApiModelProperty(value = "")
  public String getRestitution() {
    return restitution;
  }

  public void setRestitution(String restitution) {
    this.restitution = restitution;
  }

  public Sentence alternativeSentence(String alternativeSentence) {
    this.alternativeSentence = alternativeSentence;
    return this;
  }

  /**
   * Get alternativeSentence
   * @return alternativeSentence
   **/
  @JsonProperty("alternative_sentence")
  @ApiModelProperty(value = "")
  public String getAlternativeSentence() {
    return alternativeSentence;
  }

  public void setAlternativeSentence(String alternativeSentence) {
    this.alternativeSentence = alternativeSentence;
  }

  public Sentence suspendedSentence(Boolean suspendedSentence) {
    this.suspendedSentence = suspendedSentence;
    return this;
  }

  /**
   * Get suspendedSentence
   * @return suspendedSentence
   **/
  @JsonProperty("suspended_sentence")
  @ApiModelProperty(value = "")
  public Boolean isSuspendedSentence() {
    return suspendedSentence;
  }

  public void setSuspendedSentence(Boolean suspendedSentence) {
    this.suspendedSentence = suspendedSentence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sentence sentence = (Sentence) o;
    return Objects.equals(this._id, sentence._id) &&
        Objects.equals(this._rev, sentence._rev) &&
        Objects.equals(this.chargeDisposition, sentence.chargeDisposition) &&
        Objects.equals(this.phase, sentence.phase) &&
        Objects.equals(this.sentenceType, sentence.sentenceType) &&
        Objects.equals(this.commitmentTerm, sentence.commitmentTerm) &&
        Objects.equals(this.commitmentUnit, sentence.commitmentUnit) &&
        Objects.equals(this.commitmentType, sentence.commitmentType) &&
        Objects.equals(this.minimumIncarcerationMonths, sentence.minimumIncarcerationMonths) &&
        Objects.equals(this.maximumIncarcerationMonths, sentence.maximumIncarcerationMonths) &&
        Objects.equals(this.probationTermMonths, sentence.probationTermMonths) &&
        Objects.equals(this.minimumProbationMonths, sentence.minimumProbationMonths) &&
        Objects.equals(this.maximumProbationMonths, sentence.maximumProbationMonths) &&
        Objects.equals(this.fineDollars, sentence.fineDollars) &&
        Objects.equals(this.minimumFineDollars, sentence.minimumFineDollars) &&
        Objects.equals(this.maximumFineDollars, sentence.maximumFineDollars) &&
        Objects.equals(this.communityServiceHours, sentence.communityServiceHours) &&
        Objects.equals(this.restitution, sentence.restitution) &&
        Objects.equals(this.alternativeSentence, sentence.alternativeSentence) &&
        Objects.equals(this.suspendedSentence, sentence.suspendedSentence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_id, _rev, chargeDisposition, phase, sentenceType, commitmentTerm, commitmentUnit, commitmentType, minimumIncarcerationMonths, maximumIncarcerationMonths, probationTermMonths, minimumProbationMonths, maximumProbationMonths, fineDollars, minimumFineDollars, maximumFineDollars, communityServiceHours, restitution, alternativeSentence, suspendedSentence);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sentence {\n");
    
    sb.append("    _id: ").append(toIndentedString(_id)).append("\n");
    sb.append("    _rev: ").append(toIndentedString(_rev)).append("\n");
    sb.append("    chargeDisposition: ").append(toIndentedString(chargeDisposition)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    sentenceType: ").append(toIndentedString(sentenceType)).append("\n");
    sb.append("    commitmentTerm: ").append(toIndentedString(commitmentTerm)).append("\n");
    sb.append("    commitmentUnit: ").append(toIndentedString(commitmentUnit)).append("\n");
    sb.append("    commitmentType: ").append(toIndentedString(commitmentType)).append("\n");
    sb.append("    minimumIncarcerationMonths: ").append(toIndentedString(minimumIncarcerationMonths)).append("\n");
    sb.append("    maximumIncarcerationMonths: ").append(toIndentedString(maximumIncarcerationMonths)).append("\n");
    sb.append("    probationTermMonths: ").append(toIndentedString(probationTermMonths)).append("\n");
    sb.append("    minimumProbationMonths: ").append(toIndentedString(minimumProbationMonths)).append("\n");
    sb.append("    maximumProbationMonths: ").append(toIndentedString(maximumProbationMonths)).append("\n");
    sb.append("    fineDollars: ").append(toIndentedString(fineDollars)).append("\n");
    sb.append("    minimumFineDollars: ").append(toIndentedString(minimumFineDollars)).append("\n");
    sb.append("    maximumFineDollars: ").append(toIndentedString(maximumFineDollars)).append("\n");
    sb.append("    communityServiceHours: ").append(toIndentedString(communityServiceHours)).append("\n");
    sb.append("    restitution: ").append(toIndentedString(restitution)).append("\n");
    sb.append("    alternativeSentence: ").append(toIndentedString(alternativeSentence)).append("\n");
    sb.append("    suspendedSentence: ").append(toIndentedString(suspendedSentence)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

