
solution {
    puzzle = "P034"
    name = "NEW SOLUTION 3"
    arm(ARM6) {
        number = 1
        position = -20 to -5
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -19 to -5
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = -21 to 2
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 4
        position = -19 to 1
        rotation = 0
        size = 3
    }
    arm(ARM3) {
        number = 5
        position = -13 to -2
        rotation = 1
        size = 2
    }
    arm(ARM6) {
        number = 6
        position = -12 to -3
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -21 to -4
        rotation = 1
    }
    glyph(BONDER) {
        position = -19 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = -16 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = -11 to -2
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = -17 to 0
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -21 to 1
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = -16 to 1
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -11 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -21 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -20 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(3) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateClockwise()
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
            sequence(5) {
                wait(7)
                grab()
                rotateCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                drop()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
