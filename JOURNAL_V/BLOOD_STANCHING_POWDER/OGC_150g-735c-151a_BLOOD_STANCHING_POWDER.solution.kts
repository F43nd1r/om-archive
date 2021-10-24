
solution {
    puzzle = "P087"
    name = "NEW SOLUTION 2"
    arm(ARM2) {
        number = 1
        position = 3 to 0
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 4 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 1 to 7
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 8 to 2
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 5 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 5 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 6 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to 3
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 4 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 4 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        )
    }
}
