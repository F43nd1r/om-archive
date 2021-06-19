
solution {
    puzzle = "P034"
    name = "TI"
    arm(ARM3) {
        number = 1
        position = 3 to -2
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = 4 to -4
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -3 to -1
        rotation = 3
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = -4 to 0
        rotation = 3
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = -4 to -2
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 6
        position = -5 to -1
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = -4 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = -5 to 1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 0 to -2
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 2
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 4 to -5
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -6 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 1
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -7 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 5 to -5
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(3)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
