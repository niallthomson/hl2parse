/**
 * Copyright (C) 2011 Darien Hager
 *
 * This code is part of the "HL2Parse" project, and is licensed under
 * a Creative Commons Attribution-ShareAlike 3.0 Unported License. For
 * either a summary of conditions or the full legal text, please visit:
 *
 * http://creativecommons.org/licenses/by-sa/3.0/
 *
 * Permissions beyond the scope of this license may be available
 * at http://technofovea.com/ .
 */
package com.technofovea.hl2parse.fgd;

/**
 * Represents an anonymous input on an entity-class.
 * @author Darien Hager
 */
public class FgdInput {

    private static final String INPUT_QUALIFIER = "input";

    private String type;
    private String description;

    public FgdInput(String type) {
        this(type,"");
    }

    public FgdInput(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toText(String name) {
        StringBuilder sb = new StringBuilder();
        sb.append(INPUT_QUALIFIER);
        sb.append(" ");
        sb.append(name);
        sb.append("(");
        sb.append(type);
        sb.append(") : \"");
        sb.append(description);
        sb.append("\" ");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FgdInput other = (FgdInput) obj;
        if ((this.type == null) ? (other.type != null) : !this.type.equals(other.type)) {
            return false;
        }
        if ((this.description == null) ? (other.description != null) : !this.description.equals(other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.type != null ? this.type.hashCode() : 0);
        hash = 29 * hash + (this.description != null ? this.description.hashCode() : 0);
        return hash;
    }

    

    

    



}
