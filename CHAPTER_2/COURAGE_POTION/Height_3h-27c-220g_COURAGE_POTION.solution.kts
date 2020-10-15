
solution {
    puzzle = "P021"
    name = "H3 2T"
    arm(ARM1) {
        number = 1
        position = -5 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -5 to -2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -4 to -2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -7 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 0 to -1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 1 to -2
        rotation = 3
        size = 3
    }
    glyph(MULTI_BONDER) {
        position = -3 to -1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -1 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -1
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = -3 to -2
        rotation = 0
    }
    track {
        position = 2 to -1
        positions = listOf(-1 to -1, 0 to -1, 0 to 0, -1 to 0, -2 to 0)
    }
    track {
        position = -6 to 0
        positions = listOf(-1 to 0, 0 to 0, 1 to -1, 1 to -2, 2 to -2)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(1)
                back()
            }
        }
        , 
        {
            sequence(6) {
                wait(6)
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                forward()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                back()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                back()
                grab()
                forward()
                drop()
                repeat()
            }
        }
        )
    }
}
