
solution {
    puzzle = "P014"
    name = "H3 2T"
    arm(ARM1) {
        number = 1
        position = -6 to 0
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -7 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -10 to 1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -9 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -1 to 2
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 1 to 0
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 1 to 1
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -4 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -6 to 1
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = -3 to 0
        rotation = 0
    }
    track {
        position = 2 to 0
        positions = listOf(0 to 0, -1 to 0, -1 to 1)
    }
    track {
        position = -8 to 1
        positions = listOf(-1 to -1, 0 to -1, 0 to 0, -1 to 0, -2 to 0)
    }
    track {
        position = 0 to 2
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = -7 to 0
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(4)
                grab()
                pivotClockwise()
                back()
                drop()
                back()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(7)
                back()
                grab()
                pivotClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                back()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                back()
                grab()
                back()
                back()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                forward()
                grab()
                back()
                reset()
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(1)
                grab()
                forward()
                reset()
                wait(1)
                repeat()
            }
        }
        )
    }
}
