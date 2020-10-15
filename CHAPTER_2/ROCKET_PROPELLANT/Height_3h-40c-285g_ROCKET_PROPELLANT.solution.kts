
solution {
    puzzle = "P019"
    name = "H3 3T"
    arm(ARM1) {
        number = 1
        position = 3 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 1 to -2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 2 to -2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 2 to -1
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 6
        position = 3 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 8 to -2
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 9 to -2
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = 3 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 5 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 6 to -2
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 8 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 10 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 8 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 4 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 4 to 0
        rotation = 0
    }
    track {
        position = 1 to -1
        positions = listOf(0 to -1, 1 to -1, 1 to 0, 0 to 0, -1 to 0)
    }
    track {
        position = 2 to 1
        positions = listOf(0 to -1, -1 to -1)
    }
    track {
        position = 11 to -1
        positions = listOf(0 to -1, -1 to -1, -2 to -1, -3 to -1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(3)
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                back()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(6)
                grab()
                back()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(6)
                grab()
                back()
                back()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(3)
                back()
                grab()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                extend()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
            }
        }
        )
    }
}
