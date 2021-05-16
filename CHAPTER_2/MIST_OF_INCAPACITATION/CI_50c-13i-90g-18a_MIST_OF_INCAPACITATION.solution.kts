
solution {
    puzzle = "P018"
    name = "B F SPEED"
    arm(ARM6) {
        number = 1
        position = 0 to 1
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 1 to -2
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(PROJECTION) {
        position = 0 to -2
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -1 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 0 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 2 to -3
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
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
