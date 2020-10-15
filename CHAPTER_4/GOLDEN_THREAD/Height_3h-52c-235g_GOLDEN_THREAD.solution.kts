
solution {
    puzzle = "P037"
    name = "H3 6T"
    arm(ARM1) {
        number = 1
        position = 0 to 0
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -1 to 0
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -1 to 1
        rotation = -3
        size = 2
    }
    arm(ARM3) {
        number = 4
        position = -3 to 0
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 1 to 1
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 1 to -1
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -2 to -1
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -5 to 0
        rotation = -2
    }
    glyph(BONDER) {
        position = -5 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -17 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -15 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -13 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -11 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -18 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 0
        rotation = 0
    }
    track {
        position = -2 to -1
        positions = listOf(-2 to 0, -1 to 0, 0 to 0, 1 to 0, 2 to 0, 3 to 0)
    }
    track {
        position = -1 to 1
        positions = listOf(0 to 0, 1 to -1, 0 to -1)
    }
    track {
        position = 0 to 1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(7)
                grab()
                back()
                back()
                back()
                reset()
                wait(3)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                back()
                back()
                back()
                back()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(2)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                grab()
                forward()
                drop()
                back()
                back()
                wait(2)
                forward()
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                forward()
                drop()
                back()
                back()
                back()
                wait(1)
                forward()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                drop()
                back()
                wait(1)
                back()
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                back()
                grab()
                back()
                drop()
                back()
                wait(1)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                back()
                wait(1)
                back()
                grab()
                back()
                drop()
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                back()
                reset()
                wait(5)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        )
    }
}
