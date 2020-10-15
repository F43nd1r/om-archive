
solution {
    puzzle = "P070"
    name = "H3 6T"
    arm(PISTON) {
        number = 1
        position = 5 to -1
        rotation = -3
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 6 to -2
        rotation = -4
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = 7 to -2
        rotation = -4
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = 7 to -1
        rotation = -3
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = 3 to 0
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 2 to -2
        rotation = -5
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -3 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -7 to -1
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 9
        position = 8 to -2
        rotation = -3
        size = 3
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -4 to -1
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = -3 to -1
        rotation = 0
    }
    glyph(DISPERSION) {
        position = 4 to -2
        rotation = 3
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 8 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 8 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 9 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 10 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 4 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -1
        rotation = 3
    }
    track {
        position = 2 to 0
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -5 to 0
        positions = listOf(-1 to -2, -2 to -2, -2 to -1, -2 to 0, -1 to 0, 0 to 0, 1 to 0, 2 to 0)
    }
    track {
        position = 5 to -1
        positions = listOf(0 to 0, 1 to -1, 2 to -1, 2 to 0, 1 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(6)
                grab()
                rotateCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                reset()
                wait(8)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                retract()
                back()
                reset()
                wait(13)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(25)
                rotateClockwise()
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(10)
                back()
                wait(3)
                grab()
                extend()
                wait(2)
                back()
                wait(1)
                back()
                drop()
                retract()
                retract()
                wait(3)
                grab()
                extend()
                extend()
                drop()
                back()
                wait(5)
                back()
                grab()
                forward()
                wait(1)
                back()
                back()
                back()
                retract()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                retract()
                grab()
                extend()
                wait(1)
                back()
                extend()
                drop()
                retract()
                retract()
                wait(2)
                grab()
                extend()
                extend()
                drop()
                back()
                retract()
                back()
                back()
                wait(1)
                back()
                rotateClockwise()
                wait(6)
                back()
                grab()
                rotateCounterClockwise()
                drop()
                extend()
                wait(5)
                grab()
                back()
                drop()
                back()
                retract()
                wait(2)
                reset()
                wait(9)
                back()
                wait(3)
                grab()
                extend()
                wait(2)
                back()
                wait(1)
                back()
                drop()
                retract()
                retract()
                wait(3)
                grab()
                extend()
                extend()
                drop()
                back()
                wait(5)
                back()
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(3)
                grab()
                extend()
                extend()
                drop()
                back()
                wait(5)
                back()
                grab()
                forward()
                wait(1)
                back()
                back()
                back()
                retract()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                retract()
                grab()
                extend()
                wait(1)
                back()
                extend()
                drop()
                retract()
                retract()
                wait(2)
                grab()
                extend()
                extend()
                drop()
                back()
                retract()
                back()
                back()
                wait(1)
                back()
                rotateClockwise()
                wait(6)
                back()
                grab()
                rotateCounterClockwise()
                drop()
                extend()
                wait(5)
                grab()
                back()
                drop()
                back()
                retract()
                wait(2)
                back()
                back()
                wait(11)
                back()
                grab()
                extend()
                wait(2)
                back()
                wait(1)
                back()
                reset()
                wait(5)
                grab()
                extend()
                extend()
                drop()
                back()
                wait(5)
                back()
                grab()
                forward()
                wait(1)
                back()
                back()
                back()
                retract()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                retract()
                grab()
                extend()
                wait(1)
                back()
                extend()
                drop()
                retract()
                retract()
                wait(2)
                grab()
                extend()
                extend()
                drop()
                back()
                retract()
                back()
                wait(1)
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(16)
                forward()
                grab()
                back()
                back()
                back()
                wait(5)
                forward()
                reset()
                wait(12)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(10)
                grab()
                back()
                back()
                back()
                back()
                drop()
                forward()
                wait(1)
                forward()
                reset()
                wait(1)
                grab()
                back()
                pivotClockwise()
                back()
                back()
                back()
                forward()
                forward()
                forward()
                reset()
                wait(3)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                drop()
                retract()
                grab()
                extend()
                wait(1)
                back()
                extend()
                drop()
                retract()
                retract()
                wait(2)
                grab()
                extend()
                extend()
                drop()
                back()
                retract()
                back()
                back()
                wait(1)
                back()
                rotateClockwise()
                wait(6)
                back()
                grab()
                rotateCounterClockwise()
                drop()
                extend()
                wait(5)
                grab()
                back()
                drop()
                back()
                retract()
                wait(2)
                back()
                back()
                wait(8)
                back()
                wait(3)
                grab()
                extend()
                wait(2)
                back()
                wait(1)
                back()
                drop()
                retract()
                retract()
                wait(3)
                grab()
                extend()
                extend()
                drop()
                back()
                wait(1)
                back()
                wait(4)
                grab()
                forward()
                wait(1)
                back()
                back()
                back()
                retract()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                retract()
                grab()
                extend()
                wait(1)
                back()
                extend()
                drop()
                retract()
                retract()
                wait(2)
                grab()
                extend()
                extend()
                drop()
                back()
                retract()
                back()
                back()
                wait(1)
                back()
                rotateClockwise()
                wait(6)
                back()
                grab()
                rotateCounterClockwise()
                drop()
                extend()
                wait(5)
                grab()
                back()
                drop()
                back()
                wait(1)
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(7)
                back()
                grab()
                rotateCounterClockwise()
                drop()
                extend()
                wait(5)
                grab()
                back()
                drop()
                back()
                retract()
                wait(2)
                back()
                back()
                wait(8)
                back()
                wait(3)
                grab()
                extend()
                wait(2)
                back()
                wait(1)
                back()
                drop()
                retract()
                retract()
                wait(3)
                grab()
                extend()
                extend()
                drop()
                back()
                wait(5)
                back()
                grab()
                forward()
                wait(1)
                back()
                back()
                back()
                retract()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                retract()
                grab()
                extend()
                wait(1)
                back()
                extend()
                drop()
                retract()
                retract()
                wait(2)
                grab()
                extend()
                extend()
                drop()
                back()
                retract()
                back()
                back()
                wait(1)
                back()
                reset()
                wait(6)
                back()
                grab()
                rotateCounterClockwise()
                drop()
                extend()
                wait(5)
                grab()
                back()
                drop()
                back()
                retract()
                wait(2)
                back()
                back()
                wait(11)
                back()
                grab()
                extend()
                wait(2)
                back()
                wait(1)
                back()
                drop()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(21)
                grab()
                retract()
                rotateClockwise()
                wait(10)
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                drop()
                retract()
                reset()
                wait(4)
                grab()
                retract()
                rotateClockwise()
                retract()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(17)
                grab()
                retract()
                rotateClockwise()
                retract()
                rotateClockwise()
                extend()
                drop()
                retract()
                reset()
                wait(15)
                grab()
                retract()
                rotateClockwise()
                retract()
                rotateClockwise()
                reset()
                wait(18)
                grab()
                retract()
                rotateClockwise()
                wait(31)
                extend()
                reset()
            }
        }
        )
    }
}
