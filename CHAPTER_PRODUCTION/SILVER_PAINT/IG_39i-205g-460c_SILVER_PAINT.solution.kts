
solution {
    puzzle = "P076"
    name = "B II 1-6T"
    arm(ARM6) {
        number = 1
        position = 0 to 0
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to 0
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 4 to 4
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 1 to 5
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 4 to 3
        rotation = 3
        size = 1
    }
    arm(ARM6) {
        number = 6
        position = 9 to 0
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 8 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 3 to 5
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 0 to 1
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 11 to 0
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = 5 to 3
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -1 to 1
        rotation = 0
    }
    track {
        position = 1 to 5
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    track {
        position = 11 to 0
        positions = listOf(-2 to 0, -1 to 0)
    }
    conduit {
        id = 100
        position = 3 to 3
        rotation = 0
    }
    conduit {
        id = 100
        position = 0 to -1
        rotation = 0
    }
    conduit {
        id = 101
        position = 3 to 4
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
            sequence(3) {
                wait(1)
                grab()
                rotateCounterClockwise()
                wait(5)
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(9)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                forward()
                wait(3)
                drop()
                wait(2)
                grab()
                wait(2)
                drop()
            }
        }
        )
    }
}
