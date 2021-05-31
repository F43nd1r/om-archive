
solution {
    puzzle = "P089"
    name = "OVERLAP"
    arm(ARM1) {
        number = 1
        position = 2 to -3
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -4
        rotation = -2
    }
    glyph(BONDER) {
        position = 1 to -4
        rotation = -1
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = -1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = 4 to -3
        rotation = -3
    }
    glyph(BONDER) {
        position = 2 to -5
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 4 to -5
        rotation = -4
    }
    glyph(CALCIFICATION) {
        position = 0 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 2 to -4
        rotation = -3
    }
    glyph(DUPLICATION) {
        position = 2 to -4
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 1 to -4
        rotation = -4
    }
    glyph(DUPLICATION) {
        position = 3 to -5
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to -3
        rotation = -5
    }
    glyph(DUPLICATION) {
        position = 4 to -5
        rotation = -5
    }
    glyph(DUPLICATION) {
        position = 0 to -2
        rotation = -6
    }
    glyph(DUPLICATION) {
        position = 4 to -4
        rotation = -4
    }
    glyph(DUPLICATION) {
        position = 3 to -3
        rotation = -5
    }
    glyph(DUPLICATION) {
        position = 3 to -2
        rotation = -4
    }
    glyph(DUPLICATION) {
        position = 2 to -5
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 1 to -4
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 2 to -5
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 1 to -3
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 3 to -5
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 3 to -4
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to -2
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 4 to -4
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 0 to -1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 1 to -1
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = 1 to -4
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
