
solution {
    puzzle = "P019"
    name = "NEW SOLUTION 6"
    arm(ARM6) {
        number = 1
        position = -6 to -7
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -5 to -6
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -6 to -3
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = -4 to -6
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = -6 to -8
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 6
        position = -13 to -4
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 7
        position = -14 to -5
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 8
        position = -13 to -7
        rotation = 1
        size = 2
    }
    arm(ARM6) {
        number = 9
        position = -13 to -3
        rotation = 2
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = -7 to -5
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -12 to -6
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -6 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -10 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -10 to -7
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -9 to -8
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -6 to -6
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -10 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -13 to -5
        rotation = 0
    }
    track {
        position = -7 to -2
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = -4 to -7
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = -7 to -7
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = -12 to -8
        positions = listOf(0 to 0, -1 to 1)
    }
    track {
        position = -12 to -4
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(6)
                extendTape()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                rotateClockwise()
                back()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(5) {
                wait(8)
                grab()
                back()
                rotateCounterClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                back()
                rotateClockwise()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(4)
                grab()
                back()
                rotateClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(9) {
                wait(6)
                grab()
                back()
                wait(2)
                rotateCounterClockwise()
                forward()
                drop()
            }
        }
        )
    }
}
