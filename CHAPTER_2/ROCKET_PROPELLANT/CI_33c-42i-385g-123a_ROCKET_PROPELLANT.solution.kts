
solution {
    puzzle = "P019"
    name = "B CIG"
    arm(ARM6) {
        number = 1
        position = -6 to 3
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -8 to 4
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -9 to 3
        rotation = 0
        size = 2
    }
    arm(ARM3) {
        number = 4
        position = -5 to 3
        rotation = -1
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = 2 to -2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 4 to -3
        rotation = 2
        size = 2
    }
    arm(ARM6) {
        number = 7
        position = 2 to 1
        rotation = -1
        size = 2
    }
    arm(ARM6) {
        number = 8
        position = 2 to -3
        rotation = -1
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = -7 to 2
        rotation = -2
    }
    glyph(MULTI_BONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -6 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -7 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to -1
        rotation = 0
    }
    track {
        position = -9 to 2
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = -5 to 2
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = 4 to -2
        positions = listOf(1 to -1, 0 to 0, 0 to -1)
    }
    track {
        position = 1 to 2
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = 1 to -2
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
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
            sequence(2) {
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
            sequence(3) {
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
            sequence(4) {
                wait(6)
                grab()
                back()
                wait(2)
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                grab()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(7) {
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
            sequence(8) {
                wait(8)
                grab()
                back()
                rotateCounterClockwise()
                drop()
                forward()
            }
        }
        )
    }
}
