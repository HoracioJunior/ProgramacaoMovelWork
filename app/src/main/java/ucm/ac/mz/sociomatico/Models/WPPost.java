

package ucm.ac.mz.sociomatico.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


class Author {

    @SerializedName("embeddable")
    @Expose
    private Boolean embeddable;
    @SerializedName("href")
    @Expose
    private String href;

    public Boolean getEmbeddable() {
        return embeddable;
    }

    public void setEmbeddable(Boolean embeddable) {
        this.embeddable = embeddable;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

}


class Collection {

  @SerializedName("href")
  @Expose
  private String href;

  public String getHref() {
      return href;
  }

  public void setHref(String href) {
      this.href = href;
  }

}


class Cury {

   @SerializedName("name")
   @Expose
   private String name;
   @SerializedName("href")
   @Expose
   private String href;
   @SerializedName("templated")
   @Expose
   private Boolean templated;

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public String getHref() {
       return href;
   }

   public void setHref(String href) {
       this.href = href;
   }

   public Boolean getTemplated() {
       return templated;
   }

   public void setTemplated(Boolean templated) {
       this.templated = templated;
   }

}


class Guid {

    @SerializedName("rendered")
    @Expose
    private String rendered;

    public String getRendered() {
        return rendered;
    }

    public void setRendered(String rendered) {
        this.rendered = rendered;
    }

}

class Img {

   @SerializedName("src")
   @Expose
   private String src;
   @SerializedName("width")
   @Expose
   private Integer width;
   @SerializedName("height")
   @Expose
   private Integer height;

   public String getSrc() {
       return src;
   }

   public void setSrc(String src) {
       this.src = src;
   }

   public Integer getWidth() {
       return width;
   }

   public void setWidth(Integer width) {
       this.width = width;
   }

   public Integer getHeight() {
       return height;
   }

   public void setHeight(Integer height) {
       this.height = height;
   }

}


class JetpackRelatedPost {

   @SerializedName("id")
   @Expose
   private Integer id;
   @SerializedName("url")
   @Expose
   private String url;
   @SerializedName("url_meta")
   @Expose
   private UrlMeta urlMeta;
   @SerializedName("title")
   @Expose
   private String title;
   @SerializedName("date")
   @Expose
   private String date;
   @SerializedName("format")
   @Expose
   private Boolean format;
   @SerializedName("excerpt")
   @Expose
   private String excerpt;
   @SerializedName("rel")
   @Expose
   private String rel;
   @SerializedName("context")
   @Expose
   private String context;
   @SerializedName("img")
   @Expose
   private Img img;
   @SerializedName("classes")
   @Expose
   private List<Object> classes = null;

   public Integer getId() {
       return id;
   }

   public void setId(Integer id) {
       this.id = id;
   }

   public String getUrl() {
       return url;
   }

   public void setUrl(String url) {
       this.url = url;
   }

   public UrlMeta getUrlMeta() {
       return urlMeta;
   }

   public void setUrlMeta(UrlMeta urlMeta) {
       this.urlMeta = urlMeta;
   }

   public String getTitle() {
       return title;
   }

   public void setTitle(String title) {
       this.title = title;
   }

   public String getDate() {
       return date;
   }

   public void setDate(String date) {
       this.date = date;
   }

   public Boolean getFormat() {
       return format;
   }

   public void setFormat(Boolean format) {
       this.format = format;
   }

   public String getExcerpt() {
       return excerpt;
   }

   public void setExcerpt(String excerpt) {
       this.excerpt = excerpt;
   }

   public String getRel() {
       return rel;
   }

   public void setRel(String rel) {
       this.rel = rel;
   }

   public String getContext() {
       return context;
   }

   public void setContext(String context) {
       this.context = context;
   }

   public Img getImg() {
       return img;
   }

   public void setImg(Img img) {
       this.img = img;
   }

   public List<Object> getClasses() {
       return classes;
   }

   public void setClasses(List<Object> classes) {
       this.classes = classes;
   }

}

class Meta {

  @SerializedName("amp_status")
  @Expose
  private String ampStatus;

  public String getAmpStatus() {
      return ampStatus;
  }

  public void setAmpStatus(String ampStatus) {
      this.ampStatus = ampStatus;
  }

}


class Reply {

@SerializedName("embeddable")
@Expose
private Boolean embeddable;
@SerializedName("href")
@Expose
private String href;

public Boolean getEmbeddable() {
return embeddable;
}

public void setEmbeddable(Boolean embeddable) {
this.embeddable = embeddable;
}

public String getHref() {
return href;
}

public void setHref(String href) {
this.href = href;
}

}

class Self {

   @SerializedName("href")
   @Expose
   private String href;

   public String getHref() {
       return href;
   }

   public void setHref(String href) {
       this.href = href;
   }

}


class UrlMeta {

    @SerializedName("origin")
    @Expose
    private Integer origin;
    @SerializedName("position")
    @Expose
    private Integer position;

    public Integer getOrigin() {
        return origin;
    }

    public void setOrigin(Integer origin) {
        this.origin = origin;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

}


class VersionHistory {

@SerializedName("count")
@Expose
private Integer count;
@SerializedName("href")
@Expose
private String href;

public Integer getCount() {
    return count;
}

public void setCount(Integer count) {
    this.count = count;
}

public String getHref() {
    return href;
}

public void setHref(String href) {
    this.href = href;
}

}


public class WPPost {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("date_gmt")
    @Expose
    private String dateGmt;
    @SerializedName("guid")
    @Expose
    private Guid guid;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("modified_gmt")
    @Expose
    private String modifiedGmt;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("title")
    @Expose
    private Title title;
    @SerializedName("content")
    @Expose
    private Content content;
    @SerializedName("excerpt")
    @Expose
    private Excerpt excerpt;
    @SerializedName("author")
    @Expose
    private Integer author;
    @SerializedName("featured_media")
    @Expose
    private Integer featuredMedia;
    @SerializedName("comment_status")
    @Expose
    private String commentStatus;
    @SerializedName("ping_status")
    @Expose
    private String pingStatus;
    @SerializedName("sticky")
    @Expose
    private Boolean sticky;
    @SerializedName("template")
    @Expose
    private String template;
    @SerializedName("format")
    @Expose
    private String format;
    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("categories")
    @Expose
    private List<Integer> categories = null;
    @SerializedName("tags")
    @Expose
    private List<Object> tags = null;
    @SerializedName("jetpack-related-posts")
    @Expose
    private List<JetpackRelatedPost> jetpackRelatedPosts = null;
    @SerializedName("_links")
    @Expose
    private Links links;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateGmt() {
        return dateGmt;
    }

    public void setDateGmt(String dateGmt) {
        this.dateGmt = dateGmt;
    }

    public Guid getGuid() {
        return guid;
    }

    public void setGuid(Guid guid) {
        this.guid = guid;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getModifiedGmt() {
        return modifiedGmt;
    }

    public void setModifiedGmt(String modifiedGmt) {
        this.modifiedGmt = modifiedGmt;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public Excerpt getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(Excerpt excerpt) {
        this.excerpt = excerpt;
    }

    public Integer getAuthor() {
        return author;
    }

    public void setAuthor(Integer author) {
        this.author = author;
    }

    public Integer getFeaturedMedia() {
        return featuredMedia;
    }

    public void setFeaturedMedia(Integer featuredMedia) {
        this.featuredMedia = featuredMedia;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public String getPingStatus() {
        return pingStatus;
    }

    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    public Boolean getSticky() {
        return sticky;
    }

    public void setSticky(Boolean sticky) {
        this.sticky = sticky;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Integer> getCategories() {
        return categories;
    }

    public void setCategories(List<Integer> categories) {
        this.categories = categories;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public List<JetpackRelatedPost> getJetpackRelatedPosts() {
        return jetpackRelatedPosts;
    }

    public void setJetpackRelatedPosts(List<JetpackRelatedPost> jetpackRelatedPosts) {
        this.jetpackRelatedPosts = jetpackRelatedPosts;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

}


class WpAttachment {

    @SerializedName("href")
    @Expose
    private String href;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

}


//-----------------------------------blueappsoftware.wordpressinandroid.WpTerm.java-----------------------------------


class WpTerm {

    @SerializedName("taxonomy")
    @Expose
    private String taxonomy;
    @SerializedName("embeddable")
    @Expose
    private Boolean embeddable;
    @SerializedName("href")
    @Expose
    private String href;

    public String getTaxonomy() {
        return taxonomy;
    }

    public void setTaxonomy(String taxonomy) {
        this.taxonomy = taxonomy;
    }

    public Boolean getEmbeddable() {
        return embeddable;
    }

    public void setEmbeddable(Boolean embeddable) {
        this.embeddable = embeddable;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

}