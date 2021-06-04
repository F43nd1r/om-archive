
solution {
    puzzle = "w2450508212"
    name = "OVERLAP CG"
    arm(ARM1) {
        number = 1
        position = 1 to 1
        rotation = -2
        size = 2
    }
    glyph(TRIPLEX_BONDER) {
        position = 2 to -1
        rotation = 3
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to -1
        rotation = 5
    }
    glyph(TRIPLEX_BONDER) {
        position = 2 to -2
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = 0 to -2
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = 0 to -1
        rotation = 3
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to -1
        rotation = 5
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 3 to -2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 2 to -1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to -1
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = 0 to -1
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    track {
        position = 0 to 1
        positions = listOf(0 to 0, 0 to 1, 0 to 2, 1 to 1, 1 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                rotateCounterClockwise()
                back()
                back()
                back()
                back()
                back()
                reset()
            }
        }
        )
    }
}
