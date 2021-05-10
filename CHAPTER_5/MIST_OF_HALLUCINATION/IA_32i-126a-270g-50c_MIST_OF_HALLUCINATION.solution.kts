
solution {
    puzzle = "P038"
    name = "CI"
    arm(ARM1) {
        number = 1
        position = -1 to 5
        rotation = 5
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = 2 to 1
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 4 to 0
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 4
        position = 0 to 3
        rotation = 6
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = 5 to 4
        rotation = 4
        size = 3
    }
    arm(ARM6) {
        number = 6
        position = 5 to 3
        rotation = 4
        size = 2
    }
    arm(ARM6) {
        number = 7
        position = 7 to -1
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 3 to 1
        rotation = 4
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = 2
    }
    glyph(BONDER) {
        position = 5 to -1
        rotation = 3
    }
    glyph(PURIFICATION) {
        position = 3 to 3
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = 2 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 5 to 1
        rotation = 0
    }
    track {
        position = -1 to 5
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = 0 to 3
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                drop()
                back()
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
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
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
            }
        }
        )
    }
}
