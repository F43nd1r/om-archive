
solution {
    puzzle = "P096"
    name = "TRACKLESS"
    arm(ARM6) {
        number = 1
        position = -7 to 0
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = -2 to 0
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = -1 to -3
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = 1 to 0
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 8
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -4 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -6 to -4
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = -7 to 3
        rotation = 5
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 1
        rotation = 6
    }
    io(OUTPUT) {
        index = 1
        position = -4 to -3
        rotation = 6
    }
    io(OUTPUT) {
        index = 2
        position = 0 to 2
        rotation = 4
    }
    io(OUTPUT) {
        index = 3
        position = 1 to -1
        rotation = 6
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
