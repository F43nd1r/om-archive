
solution {
    puzzle = "P037"
    name = "H3 6T"
    arm(ARM1) {
        number = 1
        position = -1 to 0
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -2 to 0
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -2 to 1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -4 to 0
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 0 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -1 to -1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = -5 to 1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -6 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -10 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -12 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -14 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -16 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -18 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -19 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to 0
        rotation = 0
    }
    track {
        position = 0 to 1
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = -1 to 0
        positions = listOf(0 to 0, -1 to 1, -1 to 0)
    }
    track {
        position = -2 to -1
        positions = listOf(1 to 0, 0 to 0, -1 to 0, -2 to 0, -3 to 0)
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(3)
                grab()
                forward()
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
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
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
            sequence(2) {
                wait(1)
                forward()
                grab()
                forward()
                drop()
                forward()
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
            sequence(6) {
                wait(7)
                grab()
                forward()
                forward()
                forward()
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
                forward()
                forward()
                forward()
                forward()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                drop()
                forward()
                wait(1)
                forward()
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
                forward()
                wait(1)
                forward()
                grab()
                forward()
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
        )
    }
}
