
solution {
    puzzle = "w2450508212"
    name = "OVERLAP CAX"
    arm(ARM1) {
        number = 1
        position = 1 to -4
        rotation = -4
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 0 to -3
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 2
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to -3
        rotation = -5
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to -2
        rotation = -3
    }
    glyph(TRIPLEX_BONDER) {
        position = 0 to -2
        rotation = -1
    }
    glyph(TRIPLEX_BONDER) {
        position = 0 to -3
        rotation = -5
    }
    glyph(TRIPLEX_BONDER) {
        position = 0 to -2
        rotation = -3
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -1 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = 1 to -2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    track {
        position = 1 to -3
        positions = listOf(0 to -1, -1 to 0, 0 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(3)
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                rotateClockwise()
                pivotClockwise()
                forward()
                drop()
                back()
                wait(1)
                reset()
            }
        }
        )
    }
}
