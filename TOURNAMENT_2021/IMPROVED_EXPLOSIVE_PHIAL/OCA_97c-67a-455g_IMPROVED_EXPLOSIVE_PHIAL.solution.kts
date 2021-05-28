
solution {
    puzzle = "w2450508212"
    name = "HEIGHT (Copy)"
    arm(ARM1) {
        number = 1
        position = -8 to -6
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -7 to -6
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -6 to -6
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -5 to -6
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -3 to -6
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = -15 to -5
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = -20 to -6
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -23 to -5
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = -28 to -6
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -4 to -5
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = -12 to -6
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = -14 to -6
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = -20 to -5
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -11 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -21 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -10 to -6
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -26 to -5
        rotation = -3
    }
    track {
        position = -15 to -5
        positions = listOf(0 to 0, -1 to 0, -2 to 0, -3 to 0, -3 to -1)
    }
    track {
        position = -20 to -6
        positions = listOf(0 to 0, -1 to 0, -2 to 1)
    }
    track {
        position = -23 to -5
        positions = listOf(0 to 0, 0 to -1, -1 to -1, -2 to -1, -3 to -1, -4 to -1)
    }
    track {
        position = -3 to -6
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -8 to -6
        positions = listOf(0 to 0, -1 to 1, 0 to 1, 1 to 1, 2 to 1, 3 to 1, 4 to 0, 3 to 0, 2 to 0, 1 to 0)
    }
    track {
        position = -30 to -4
        positions = listOf(2 to -2, 1 to -1, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(2)
                grab()
                forward()
                forward()
                forward()
                forward()
                retract()
                retract()
                reset()
                wait(6)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(12)
                grab()
                retract()
                retract()
                forward()
                forward()
                drop()
                wait(4)
                extend()
                extend()
                back()
                back()
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(18)
                grab()
                forward()
                forward()
                forward()
                forward()
                forward()
                drop()
                wait(1)
                reset()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                wait(1)
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(9)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                reset()
                wait(8)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                forward()
                wait(1)
                forward()
                wait(8)
                grab()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                wait(1)
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                forward()
                grab()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                forward()
                forward()
                wait(9)
                forward()
                grab()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(24)
                grab()
                forward()
                forward()
                reset()
                wait(9)
                repeat()
            }
        }
        )
    }
}
