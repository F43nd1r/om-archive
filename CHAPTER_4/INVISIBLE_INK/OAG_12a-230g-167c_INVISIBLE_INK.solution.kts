
solution {
    puzzle = "P032"
    name = "NEW SOLUTION 18"
    arm(PISTON) {
        number = 1
        position = -1 to 0
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 0 to 0
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 0
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 0 to 0
        rotation = -3
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -1
        rotation = 0
    }
    track {
        position = 0 to 0
        positions = listOf(0 to 0, 1 to -1, 1 to 0)
    }
    track {
        position = -1 to 0
        positions = listOf(0 to 0, -1 to 1, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                extend()
                reset()
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                extend()
                reset()
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                reset()
            }
        }
        )
    }
}
