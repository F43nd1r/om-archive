
solution {
    puzzle = "P076"
    name = "B X S II"
    arm(ARM6) {
        number = 1
        position = 4 to 4
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 2 to 4
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 9 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 1 to 0
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 0 to -1
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 9 to -1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 0 to 0
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = 4 to 3
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = 11 to 0
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = 1 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = 5 to 3
        rotation = 0
    }
    track {
        position = 9 to 0
        positions = listOf(0 to 0, 1 to 0)
    }
    conduit {
        id = 100
        position = 1 to 4
        rotation = 0
    }
    conduit {
        id = 100
        position = 1 to -1
        rotation = 0
    }
    conduit {
        id = 101
        position = 2 to 3
        rotation = 0
    }
    conduit {
        id = 101
        position = 8 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(21)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                grab()
                back()
                drop()
            }
        }
        )
    }
}
