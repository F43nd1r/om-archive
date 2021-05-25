
solution {
    puzzle = "P096"
    name = "TRACKLESS (Copy)"
    arm(ARM6) {
        number = 1
        position = -1 to -1
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = 4 to -1
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = 5 to -4
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = 7 to -1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 5 to -1
        rotation = 8
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 9 to -3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to -5
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 9 to -1
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 5
    }
    io(OUTPUT) {
        index = 0
        position = 8 to 0
        rotation = 6
    }
    io(OUTPUT) {
        index = 1
        position = 2 to -4
        rotation = 6
    }
    io(OUTPUT) {
        index = 2
        position = 6 to 1
        rotation = 4
    }
    io(OUTPUT) {
        index = 3
        position = 6 to -2
        rotation = 8
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                wait(4)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(8)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
