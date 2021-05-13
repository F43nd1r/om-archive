
solution {
    puzzle = "P060"
    name = "OA"
    arm(ARM1) {
        number = 1
        position = -6 to -3
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -6 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = -6 to -2
        rotation = 2
    }
    glyph(BONDER) {
        position = -5 to -1
        rotation = 3
    }
    glyph(CALCIFICATION) {
        position = -7 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -6 to -2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -6 to -2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -5 to -2
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -5 to -1
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -6 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -6 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -6 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
