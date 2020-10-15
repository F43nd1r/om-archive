
solution {
    puzzle = "P029"
    name = "H3 6T"
    arm(ARM1) {
        number = 1
        position = -5 to 1
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -7 to 0
        rotation = -6
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -7 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -8 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -8 to 1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -4 to 1
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = -2 to 0
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 8
        position = -2 to 1
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 9
        position = -1 to 1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = 1 to -1
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 2
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = -1 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -4 to 0
        rotation = 5
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 8 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 8 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 10 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 10 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 12 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 12 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 14 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -4 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -5 to 0
        rotation = 0
    }
    track {
        position = 1 to -1
        positions = listOf(-3 to 1, -2 to 1, -2 to 2, -3 to 2)
    }
    track {
        position = -5 to -1
        positions = listOf(-3 to 1, -3 to 2, -2 to 2, -1 to 2, -1 to 1, 0 to 0, -1 to 0, -2 to 0)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(1)
                grab()
                back()
                wait(1)
                back()
                drop()
                back()
                back()
                back()
                reset()
                wait(3)
                repeat()
                wait(11)
                repeat()
                wait(12)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                back()
                grab()
                back()
                wait(1)
                back()
                drop()
                back()
                back()
                reset()
                wait(3)
                repeat()
                wait(11)
                repeat()
                wait(13)
                back()
                grab()
                back()
                wait(1)
                back()
                drop()
                back()
                back()
                wait(1)
                grab()
                forward()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(7)
                back()
                back()
                grab()
                back()
                wait(1)
                back()
                drop()
                back()
                reset()
                wait(3)
                repeat()
                wait(12)
                repeat()
                wait(12)
                back()
                back()
                grab()
                back()
                wait(1)
                back()
                drop()
                wait(2)
                back()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                forward()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                forward()
                rotateClockwise()
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                forward()
                rotateClockwise()
                wait(2)
                forward()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                forward()
                extend()
                extend()
                drop()
                retract()
                retract()
                forward()
                wait(1)
                forward()
                grab()
                forward()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(7)
                forward()
                wait(1)
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                forward()
                extend()
                extend()
                drop()
                retract()
                retract()
                forward()
                rotateClockwise()
                forward()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                forward()
                rotateClockwise()
                wait(1)
                forward()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                forward()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                forward()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(7)
                forward()
                wait(3)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(1)
                forward()
                wait(1)
                forward()
                wait(3)
                forward()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                forward()
                extend()
                extend()
                drop()
                retract()
                retract()
                forward()
                rotateClockwise()
                forward()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                forward()
                rotateClockwise()
                wait(1)
                forward()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                rotateClockwise()
                reset()
                wait(10)
                repeat()
                wait(5)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(4)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(8)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(4)
                repeat()
                wait(10)
                repeat()
                wait(7)
                repeat()
                wait(8)
                repeat()
                wait(7)
                repeat()
            }
        }
        )
    }
}
