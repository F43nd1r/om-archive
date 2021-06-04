
solution {
    puzzle = "w2450508212"
    name = "OVERLAP CAX"
    arm(PISTON) {
        number = 1
        position = 1 to 0
        rotation = -2
        size = 1
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
        positions = listOf(1 to 1, 1 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                extend()
                rotateCounterClockwise()
                back()
                back()
                retract()
                forward()
                forward()
                reset()
            }
        }
        )
    }
}
