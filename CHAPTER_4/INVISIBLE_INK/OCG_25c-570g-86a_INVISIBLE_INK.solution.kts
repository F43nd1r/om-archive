
solution {
    puzzle = "P032"
    name = "OVERLAP AX"
    arm(PISTON) {
        number = 1
        position = 4 to 0
        rotation = -3
        size = 3
    }
    arm(PISTON) {
        number = 2
        position = -5 to 2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 0 to 1
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -1 to 1
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -2
    }
    glyph(BONDER) {
        position = 0 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to 2
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -2 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to 3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to 3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to 3
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -1 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 0 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to 0
        rotation = 0
    }
    track {
        position = 0 to 1
        positions = listOf(0 to 0, 0 to -1, 0 to -2)
    }
    track {
        position = -4 to 0
        positions = listOf(3 to 1, 3 to 2, 3 to 3)
    }
    track {
        position = 4 to -5
        positions = listOf(-1 to 6, 0 to 6, 1 to 6, 2 to 6, 3 to 5, 3 to 4, 3 to 3, 2 to 3, 2 to 4, 2 to 5, 1 to 5, 1 to 4, 1 to 3, 0 to 3, 0 to 4, 0 to 5)
    }
    track {
        position = -5 to 7
        positions = listOf(1 to -6, 0 to -6, -1 to -6, -2 to -6, -3 to -5, -3 to -4, -3 to -3, -2 to -3, -2 to -4, -2 to -5, -1 to -5, -1 to -4, -1 to -3, 0 to -3, 0 to -4, 0 to -5)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                forward()
                wait(11)
                drop()
                wait(5)
                grab()
                back()
                back()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                forward()
                wait(11)
                drop()
                wait(5)
                grab()
                back()
                back()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                pivotClockwise()
                back()
                retract()
                forward()
                forward()
                retract()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                back()
                pivotClockwise()
                back()
                retract()
                forward()
                forward()
                retract()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                extend()
                extend()
                reset()
            }
        }
        )
    }
}
