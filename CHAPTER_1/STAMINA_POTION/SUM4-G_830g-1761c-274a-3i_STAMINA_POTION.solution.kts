
solution {
    puzzle = "P015"
    name = "INSTRUCTIONS 12"
    arm(ARM6) {
        number = 1
        position = 2 to -1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -3 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -5 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to -4
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to -3
        rotation = -1
    }
    glyph(BONDER) {
        position = 4 to -5
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -5
        rotation = 1
    }
    glyph(BONDER) {
        position = 5 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 8 to -3
        rotation = -1
    }
    glyph(BONDER) {
        position = 9 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 11 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 8 to 5
        rotation = -1
    }
    glyph(BONDER) {
        position = 10 to 3
        rotation = 1
    }
    glyph(BONDER) {
        position = 12 to 3
        rotation = 0
    }
    glyph(BONDER) {
        position = 9 to 7
        rotation = 0
    }
    glyph(BONDER) {
        position = 14 to 5
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -5 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -3 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to -5
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 5 to -4
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 7 to -4
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 6 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 10 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 9 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 7 to 4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 11 to 4
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 12 to 1
        rotation = 1
    }
    glyph(PROJECTION) {
        position = 0 to -1
        rotation = -3
    }
    glyph(PROJECTION) {
        position = -7 to 0
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = 7 to 7
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to -1
        rotation = 0
    }
    track {
        position = 1 to -2
        positions = listOf(1 to 1, 1 to 0, 0 to 0, -1 to 0, -2 to 0, -3 to 1, -4 to 2, -5 to 3, -6 to 3, -7 to 3, -7 to 2, -7 to 1, -7 to 0, -6 to -1, -5 to -1, -5 to -2, -4 to -2, -4 to -3, -4 to -4, -3 to -5, -2 to -5, -1 to -5, -1 to -4, 0 to -4, 1 to -5, 2 to -6, 3 to -7, 4 to -7, 5 to -7, 6 to -7, 7 to -7, 7 to -6, 6 to -5, 6 to -6, 5 to -6, 4 to -6, 3 to -6, 2 to -5, 2 to -4, 2 to -3, 3 to -4, 4 to -4, 5 to -4, 6 to -4, 7 to -4, 7 to -3, 6 to -3, 5 to -2, 4 to -1, 5 to -1, 5 to 0, 6 to 0, 7 to 0, 8 to -1, 9 to -1, 8 to 0, 7 to 1, 6 to 2, 5 to 3, 4 to 4, 4 to 5, 4 to 6, 5 to 6, 5 to 5, 5 to 4, 6 to 3, 7 to 3, 7 to 4, 8 to 4, 9 to 4, 10 to 4, 10 to 3, 10 to 2, 11 to 1, 12 to 1, 12 to 2, 13 to 2, 13 to 3, 13 to 4, 13 to 5, 13 to 6, 12 to 7, 11 to 7, 10 to 8, 9 to 8, 9 to 7, 8 to 7, 7 to 8, 6 to 8, 6 to 7, 5 to 7, 4 to 7, 3 to 7, 3 to 6, 3 to 5, 3 to 4, 3 to 3, 3 to 2, 3 to 1, 2 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                drop()
            }
        }
        )
    }
}
