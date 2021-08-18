
solution {
    puzzle = "P038"
    name = "RUBE GOLDBERG"
    arm(ARM6) {
        number = 1
        position = -2 to -3
        rotation = 0
        size = 2
    }
    arm(ARM3) {
        number = 2
        position = 0 to -2
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -4 to 2
        rotation = 5
        size = 2
    }
    arm(ARM6) {
        number = 4
        position = 1 to 1
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 5
        position = 0 to 3
        rotation = 4
        size = 2
    }
    arm(ARM6) {
        number = 6
        position = 2 to 1
        rotation = 4
        size = 3
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = -2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -2
        rotation = 4
    }
    io(INPUT) {
        index = 1
        position = 0 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(10)
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(10)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(8)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
