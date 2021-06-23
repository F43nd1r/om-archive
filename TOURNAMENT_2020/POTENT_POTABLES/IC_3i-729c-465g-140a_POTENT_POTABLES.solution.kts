
solution {
    puzzle = "w2501727721"
    name = "B I3"
    arm(ARM6) {
        number = 1
        position = -2 to -3
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -2
    }
    glyph(BONDER) {
        position = -4 to 0
        rotation = -3
    }
    glyph(BONDER) {
        position = -6 to -5
        rotation = 0
    }
    glyph(BONDER) {
        position = -8 to -4
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to 4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -9 to 0
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -10 to -1
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -9 to -3
        rotation = 4
    }
    glyph(UNBONDER) {
        position = 3 to -1
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = -5 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -7 to 0
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -6 to 0
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -7 to 1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = -9 to 1
        rotation = 5
    }
    glyph(DUPLICATION) {
        position = -10 to -2
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = -3 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to -5
        rotation = 3
    }
    io(OUTPUT) {
        index = 1
        position = -5 to 3
        rotation = -1
    }
    track {
        position = -2 to -3
        positions = listOf(0 to 0, 1 to 0, 2 to 0, 3 to 0, 4 to 0, 5 to 0, 5 to 1, 4 to 1, 3 to 2, 3 to 3, 3 to 4, 2 to 5, 1 to 6, 0 to 6, 0 to 5, 0 to 4, 0 to 3, -1 to 3, -2 to 4, -2 to 5, -3 to 5, -4 to 5, -5 to 5, -6 to 6, -6 to 5, -7 to 5, -8 to 5, -9 to 5, -9 to 4, -9 to 3, -8 to 3, -7 to 2, -6 to 1, -6 to 0, -5 to -1, -4 to -1, -4 to 0, -3 to 0, -2 to -1, -1 to -1, 0 to -1)
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
