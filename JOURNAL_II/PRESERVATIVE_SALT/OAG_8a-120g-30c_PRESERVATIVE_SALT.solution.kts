
solution {
    puzzle = "P060"
    name = "OA"
    arm(ARM1) {
        number = 1
        position = -1 to 1
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = 3
    }
    glyph(BONDER) {
        position = 1 to 2
        rotation = 5
    }
    glyph(BONDER) {
        position = 1 to 2
        rotation = 4
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 6
    }
    glyph(BONDER) {
        position = 1 to 2
        rotation = 3
    }
    glyph(UNBONDER) {
        position = 1 to 1
        rotation = 4
    }
    glyph(UNBONDER) {
        position = 0 to 2
        rotation = 5
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 1 to 2
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 1 to 1
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 1
        rotation = 6
    }
    io(INPUT) {
        index = 1
        position = 1 to 2
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
                drop()
            }
        }
        )
    }
}
