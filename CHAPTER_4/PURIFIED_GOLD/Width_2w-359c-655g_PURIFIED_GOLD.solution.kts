
solution {
    puzzle = "P036"
    name = "W2"
    arm(PISTON) {
        number = 1
        position = -11 to -10
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -10 to -11
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -8 to -9
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = -7 to -6
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = -4 to -5
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -3 to -3
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = 8 to 7
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 8
        position = 7 to 8
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 9
        position = 5 to 6
        rotation = 6
        size = 1
    }
    arm(PISTON) {
        number = 10
        position = 4 to 3
        rotation = 7
        size = 2
    }
    arm(PISTON) {
        number = 11
        position = 1 to 2
        rotation = 6
        size = 2
    }
    arm(PISTON) {
        number = 12
        position = 0 to -1
        rotation = 1
        size = 2
    }
    glyph(PURIFICATION) {
        position = -10 to -9
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = -8 to -7
        rotation = -2
    }
    glyph(PURIFICATION) {
        position = -6 to -6
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -4 to -3
        rotation = -2
    }
    glyph(PURIFICATION) {
        position = 3 to 3
        rotation = 3
    }
    glyph(PURIFICATION) {
        position = 1 to 0
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = 7 to 6
        rotation = 2
    }
    glyph(PURIFICATION) {
        position = 5 to 4
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = -1 to -2
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = -9 to -8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -10 to -10
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 7 to 7
        rotation = 0
    }
    track {
        position = -2 to -2
        positions = listOf(0 to 0, -1 to 0, -1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(7)
                repeat()
                wait(13)
                repeat()
                wait(13)
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
                wait(7)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(17)
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                reset()
                wait(6)
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(36)
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                drop()
                retract()
                reset()
                wait(20)
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(36)
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                drop()
                retract()
                reset()
                wait(20)
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(7)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(7)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(5)
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(17)
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                reset()
                wait(6)
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(69)
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                extend()
                grab()
                retract()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(69)
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                reset()
            }
        }
        )
    }
}
