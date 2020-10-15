
solution {
    puzzle = "P065"
    name = "H3 6T"
    arm(ARM2) {
        number = 1
        position = -2 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to 0
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 2 to 0
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 2 to 1
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = -1 to -1
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = 1 to -1
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -4 to 0
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
        position = -20 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -22 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -24 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -26 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -28 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -29 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 1
        rotation = 0
    }
    track {
        position = -4 to -1
        positions = listOf(1 to 0, 2 to 0, 3 to 0, 4 to 0, 5 to 0, 5 to 1, 4 to 2)
    }
    track {
        position = 1 to 1
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(5)
                grab()
                back()
                drop()
                back()
                wait(5)
                grab()
                forward()
                drop()
                reset()
                wait(4)
                repeat()
                wait(16)
                repeat()
                wait(16)
                repeat()
                wait(16)
                repeat()
                wait(16)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                forward()
                drop()
                back()
                back()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                wait(1)
                forward()
                wait(1)
                reset()
                wait(1)
                repeat()
                wait(16)
                repeat()
                wait(16)
                repeat()
                wait(16)
                repeat()
                wait(16)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                repeat()
                wait(16)
                repeat()
                wait(16)
                repeat()
                wait(16)
                repeat()
                wait(16)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                grab()
                retract()
                back()
                drop()
                forward()
                reset()
                grab()
                back()
                back()
                reset()
                wait(7)
                repeat()
                wait(16)
                repeat()
                wait(16)
                repeat()
                wait(16)
                repeat()
                wait(16)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(7)
                forward()
                grab()
                back()
                back()
                extend()
                drop()
                forward()
                forward()
                grab()
                back()
                back()
                extend()
                reset()
                wait(4)
                repeat()
                wait(16)
                repeat()
                wait(16)
                repeat()
                wait(16)
                repeat()
                wait(16)
                forward()
                grab()
                back()
                back()
                extend()
                drop()
                forward()
                forward()
                grab()
                back()
                back()
                back()
                extend()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                forward()
                reset()
                wait(5)
                grab()
                forward()
                reset()
                wait(6)
                repeat()
                wait(16)
                repeat()
                wait(16)
                repeat()
                wait(16)
                repeat()
                wait(16)
                repeat()
            }
        }
        )
    }
}
