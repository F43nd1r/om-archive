
solution {
    puzzle = "P038"
    name = "B TI18 1-3T"
    arm(ARM6) {
        number = 1
        position = -3 to 2
        rotation = 0
        size = 1
    }
    arm(ARM2) {
        number = 2
        position = -2 to -1
        rotation = -1
        size = 2
    }
    arm(ARM2) {
        number = 3
        position = -3 to -2
        rotation = -1
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = 3 to 2
        rotation = -5
        size = 1
    }
    arm(ARM2) {
        number = 5
        position = -1 to 3
        rotation = 0
        size = 3
    }
    arm(ARM2) {
        number = 6
        position = 5 to -2
        rotation = -11
        size = 3
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = -2
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = -2
    }
    glyph(BONDER) {
        position = -4 to 3
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 3 to 1
        rotation = -4
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -5
        rotation = -12
    }
    io(INPUT) {
        index = 1
        position = 2 to 3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateCounterClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(7)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(7)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
