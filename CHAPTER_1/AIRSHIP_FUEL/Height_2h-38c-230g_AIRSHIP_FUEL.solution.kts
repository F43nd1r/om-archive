
solution {
    puzzle = "P008"
    name = "H2 2T"
    arm(ARM1) {
        number = 1
        position = 11 to -1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 10 to 0
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -1 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -2 to 0
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = 1 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 3 to 0
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = 4 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 7 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 6 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 8 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 2 to -1
        rotation = 0
    }
    track {
        position = 10 to 0
        positions = listOf(-1 to -1, 0 to -1, 1 to -1, 0 to 0, -1 to 0, -2 to 0)
    }
    track {
        position = -1 to -1
        positions = listOf(0 to 0, 1 to 0, 0 to 1, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                forward()
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                back()
                back()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                extend()
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(1)
                grab()
                back()
                back()
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(6)
                back()
                grab()
                back()
                back()
                back()
                back()
                back()
                reset()
            }
        }
        )
    }
}
